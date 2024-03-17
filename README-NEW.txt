--------------------------------------- Changes ---------------------------------

------------------------------------- IMPORTANT!!!!! -------------------------------------
Database files are inside the main project folder "d287-java-frameworks".
The location of the database files should NOT need to be changed as it is set to load from this folder without
any modifications.


## LINES 14 - 100 @ mainscreen.html (Part C)
    -- Title, shop name and look updated. 'About Us' button added

## @ about.html (Part D)
    -- New page added detailing the specifics of the website, with link leading back to the main screen

## (Part E)
    -- Parts and Products are added to the inventory using In-house Part and Product interface. 6 parts and 5 products

## LINES 103 - 104 @ mainscreen.html (Part F)
    -- 'Buy Now' button added
    -- 'BuyController' added to controllers package to handle logic of buy button
    --  purchase confirmation page added ''@ confirmationbuyproduct' to templates package

## LINES 34 - 40 @ Part.java (Part G)
    -- invMin and InvMax fields added. @Min and @Max validation added for both fields
    -- New minimum and maximum text fields added to Inhouse and Outsource parts forms
        LINE 26 - 30 @ InhousePartForm.html
        LINE 27 - 31 @ OutsourcedPartForm.html
    -- Inventory renamed, and reloaded with new minimum and maximum columns
    -- Inventory constraint checking method added to determine if inventory is within the minimum and maximum
        LINES 145 - 150 @ Part.java

## (Part H)
    -- LINES 42 - 61 @ AddInhousePartController.java | LINES 43 - 61 @ AddOutsourcedPartController.java
        Inventory checking and error message added for low inventory, and inventory maximum

## (Part I)
    -- LINES 161 - 191 @ PartTest.java in the 'test/java/domain' packages
        4 total tests (two for each inventory minimum and inventory maximum) added

## (Part J)
    -- DeletePartValidation.java and ValidDeletePart.java (in "/validators" package) removed because they are unused.