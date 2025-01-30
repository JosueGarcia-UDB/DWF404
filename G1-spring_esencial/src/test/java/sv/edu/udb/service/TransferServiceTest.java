package sv.edu.udb.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import sv.edu.udb.configuration.TestInfrastructureConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TransferServiceTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = SpringApplication.run(TestInfrastructureConfig.class);
    }
    //Hay varias formas de acceder al bean
    //Las veremos en cada uno de los test

    @Test
    void getBeanByCastAndTransferMoney(){
        //Obteniendo el Bean
        final TransferService transferService = (TransferService)context.getBean("transferService");

        //Utilizando el Bean
        assertNotNull(transferService);

        final Double amountTransfered = transferService.transfer(1, 2, 20D);
        assertEquals(400D, amountTransfered);
    }

    @Test
    void getBeanTypeMethodAndTransferMoney(){
        //Obteniendo el bean
        final TransferService transferService = context.getBean("transferService", TransferService.class);
        assertNotNull(transferService); //Not null object
        final Double amountTransfered = transferService.transfer(1, 2, 20D);
        assertEquals(400D, amountTransfered);
    }

    @Test
    void getBeanByBeanIdWhenIdIsUniqueAndTransferMoney() {
        //Obteniendo el bean
        final TransferService transferService = context.getBean(TransferService.class);
        assertNotNull(transferService);
        final Double amountTransfered = transferService.transfer(1, 2, 20D);
        assertEquals(400D, amountTransfered);
    }
}
