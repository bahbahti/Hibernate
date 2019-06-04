package com.netcracker;

import com.netcracker.config.SpringConfig;
import com.netcracker.service.interfaces.IBooksService;
import com.netcracker.service.interfaces.ICustomerService;
import com.netcracker.service.interfaces.IPurchaseService;
import com.netcracker.service.interfaces.IShopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        ICustomerService customerService = (ICustomerService) context.getBean("customerService");
        IShopService shopService = (IShopService) context.getBean("shopService");
        IBooksService bookService = (IBooksService) context.getBean("booksService");
        IPurchaseService purchaseService = (IPurchaseService) context.getBean("purchaseService");

        //update method
        /*purchaseService.updateById(3, new Purchase(new Date(1996, 11,  12), 2, 1, 2, 111, 1111));
        bookService.updateById(3, new Books("BBBB1", 100, "AZAZA", 50));
        customerService.updateById(2, new Customer("valuev", "leninski", 50));
        shopService.updateById(4, new Shop("garage", "petrovo", 13));*/

        //add methods
        /*purchaseService.add(new Purchase(new Date(1995, 11,  12), 1, 5, 4, 100, 1500));
        bookService.add(new Books("LOR", 100, "NY", 150));
        customerService.add(new Customer("pupkin", "yaroslavl", 10));
        shopService.add(new Shop("llime", "gggg", 130));*/

        //delete methods
        /*purchaseService.deleteById(11);
        bookService.deleteById(5);
        customerService.deleteById(2);
        shopService.deleteById(6);*/

        //find all
        /*System.out.println(purchaseService.findAll());
        System.out.println(bookService.findAll());
        System.out.println(customerService.findAll());
        System.out.println(shopService.findAll());*/

        //rowcount
        /*System.out.println(purchaseService.getRowCount());
        System.out.println(bookService.getRowCount());
        System.out.println(customerService.getRowCount());
        System.out.println(shopService.getRowCount());*/

        //Различные названия и стоимость книг
        //bookService.showUniqueBooks();

        //Различные районы
       // customerService.showAreas();

        //Месяцы покупок
       // purchaseService.showMonths();

        //Фамилии и скидки жителей нижегородского района
       // customerService.showLastNameAndSale();

        //Названия магазинов сормовского и советского районов
        //shopService.showShopNames();

        //Список книг со словом Windows и книг дороже 20000
        bookService.showWindowsAndExpensiveBooks();

        //4a
        //purchaseService.task4a();

        //4b
        //purchaseService.task4b();

        //5a
        //purchaseService.task5a();

        //5b
        //purchaseService.task5b();

        //5c
        // purchaseService.task5c();

        //5d
         //purchaseService.task5d();

    }

}
