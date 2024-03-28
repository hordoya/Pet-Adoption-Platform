//package Pet.Adoption.Platform.Project.Controllers;
//
//import Pet.Adoption.Platform.Project.Services.PetService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import Pet.Adoption.Platform.Project.Models.Pet;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Controller
//public class AdoptionController {
//    @Autowired
//    private PetService petService;
//    @GetMapping("/adopted-pets")
//    public String showAdoptedPets(Model model) {
//        List<Pet> allPets = petService.findAll(); // Retrieve all pets
//        List<Pet> adoptedPets = allPets.stream()
//                .filter(Pet::isAdopted)
//                .collect(Collectors.toList()); // Filter adopted pets
//        model.addAttribute("adoptedPets", adoptedPets);
//        return "adopted-pets"; // Return the view name (e.g., "adopted-pets.html")
//    }
////    @PostMapping("/pet/addToAdapt/{itemId}")
////    public String addCrateToCart(@PathVariable Long productId, Model model, @RequestParam("quantity") int quantity) {
////        Pet crate = (Pet) this.petService.findPetById(productId);
////        if (crate != null) {
////            Pet cartItem = new Pet();
////            cartItem.setBeverage(crate);
////            cartItem.setQuantity(quantity);
////            this.cartService.saveToCart(cartItem);//save to cart
////        }
////        return "redirect:/";
////    }
//}
