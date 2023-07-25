@regression

Feature: Check Computer menu Page Functionality

  @sanity
  Scenario: Verify User Should Navigate To Computer Page successfully
    Given   User should on Home Page
    When    Click On Computer Tab
    Then    Verify Computer Page Header "Computers"

    @smoke
    Scenario: Verify User Should Navigate To Desktop Page Successfully
      Given User should on Home Page
      When  Click On Computer Tab
      And   Click On Desktop Link
      Then  Verify Desktop Page Header "Desktops"


      Scenario Outline: Verify That User should Build Your Own Computer And Add Them To Cart Successully
          Given Click On Computer Tab
          When  Click On Desktop Link
          And   ClickOn Product Name Build Your computer
          And   Select Processor "<processor>"
          And   Select Ram "<ram>"
          And   Select HDD "<hdd>"
          And   Select OS  "<os>"
          And   Select Software "<software>"
          And   Click On Add To Cart Button
          Then  Verify The Message "The product has been added to your shopping cart"

          Examples:

            | processor                                       | ram           | hdd               | os                      | software                   |
            | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
            | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
            | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |