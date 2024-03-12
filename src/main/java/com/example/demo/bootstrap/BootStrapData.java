package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


/*        // Checking to see if parts already exist
        if (partRepository.count() <= 0) {

            // Part 1, Soft Tire
            OutsourcedPart o = new OutsourcedPart();
            o.setCompanyName("Aston Martin F1");
            o.setName("Soft Tire");
            o.setInv(1);
            o.setPrice(675.0);
            o.setId(100);
            o.setInvMin(0);
            o.setInvMax(4);
            outsourcedPartRepository.save(o);
*//*            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }*//*



        // Part 2, SuperSoft Tire
            OutsourcedPart o1 = new OutsourcedPart();
            o1.setCompanyName("Aston Martin F1");
            o1.setName("SuperSoft Tire");
            o1.setInv(1);
            o1.setPrice(675.0);
            o1.setId(101);
            o1.setInvMin(0);
            o1.setInvMax(4);
            outsourcedPartRepository.save(o1);



        // Part 3, Medium Tire
            OutsourcedPart o2 = new OutsourcedPart();
            o2.setCompanyName("Aston Martin F1");
            o2.setName("Medium Tire");
            o2.setInv(1);
            o2.setPrice(675.0);
            o2.setId(102);
            o2.setInvMin(0);
            o2.setInvMax(4);
            outsourcedPartRepository.save(o2);

            // Part 4, Hard Tire
            OutsourcedPart o3 = new OutsourcedPart();
            o3.setCompanyName("Aston Martin F1");
            o3.setName("Hard Tire");
            o3.setInv(1);
            o3.setPrice(675.0);
            o3.setId(103);
            o3.setInvMin(0);
            o3.setInvMax(4);
            outsourcedPartRepository.save(o3);

            // Part 5, Wet Tire
            OutsourcedPart o4 = new OutsourcedPart();
            o4.setCompanyName("Aston Martin F1");
            o4.setName("Wet Tire");
            o4.setInv(1);
            o4.setPrice(675.0);
            o4.setId(104);
            o4.setInvMin(0);
            o4.setInvMax(4);
            outsourcedPartRepository.save(o4);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }

        }*/


/*        System.out.println(thePart.getCompanyName());
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }*/

 /*       // Checking to see if products already exist
        if (productRepository.count() <= 0) {

            Product carSoft = new Product("AMR24 F1 Race Car (with Soft Tires)", 15000000, 1);
            Product carSuperSoft = new Product("AMR24 F1 Race Car (with SuperSoft Tires)", 15000000, 1);
            Product carMedium = new Product("AMR24 F1 Race Car (with Medium Tires)", 15000000, 1);
            Product carHard = new Product("AMR24 F1 Race Car (with Hard Tires)", 15000000, 1);
            Product carWet = new Product("AMR24 F1 Race Car (with Wet Tires)", 15000000, 1);

            productRepository.save(carSoft);
            productRepository.save(carSuperSoft);
            productRepository.save(carMedium);
            productRepository.save(carHard);
            productRepository.save(carWet);



*//*            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
            *//*

        }*/
    }
}
