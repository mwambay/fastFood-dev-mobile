package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Home
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.model.User

object HomeRepository {

    fun getHomeData(): Home {
        return Home(
            user = User(
                name = "Jenovic"
            ),
            categories = CategoriesRepository.getCategoriesData(),
            popularMenuItems = listOf(
                MenuItem(
                    id = 4001,
                    name = "Menu Big Mac",
                    description = "Le seul et unique Menu Big Mac de McDonald’s. Les ingrédients du Big Mac comprennent un pain classique aux graines de sésame, la sauce Big Mac, du fromage américain et des cornichons tranchés. Le Menu Big Mac est servi avec nos célèbres frites et votre choix de boisson gazeuse Coca-Cola.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "category_beverages.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4002,
                    name = "Menu Cheeseburger",
                    description = "Notre Menu Cheeseburger est un classique simple et satisfaisant avec un burger de bœuf 100% McDonald’s, servi avec nos célèbres frites et votre choix de soda moyen ou boisson gazeuse.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_cheeseburger_combo_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Menu Double Quarter Pounder avec Fromage",
                    description = "Obtenez le double de la saveur de bœuf frais avec un Double Quarter Pounder avec Fromage fait avec du bœuf frais cuit à la commande. Servi avec nos célèbres frites et votre choix de boisson gazeuse.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4005,
                    name = "Menu 10 McNuggets de Poulet",
                    description = "Savourez 10 McNuggets de Poulet tendres et délicieux faits de viande de poulet blanche, plus nos célèbres frites et votre choix de boisson moyenne avec les 10 McNuggets pour le menu ultime de McDonald’s.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_ten_piece_chicken_mcnuggets_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
//                MenuItem(
//                    id = 1001,
//                    name = "Big Mac",
//                    description = "La perfection commence par deux galettes de bœuf 100% pur et une sauce Big Mac prise en sandwich entre un pain aux graines de sésame. Il est garni de cornichons, de laitue râpée croustillante, d'oignons finement hachés et de fromage américain.",
//                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_big_mac.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
//                MenuItem(
//                    id = 1003,
//                    name = "Double Quarter Pounder avec Fromage",
//                    description = "Chaque Double Quarter Pounder avec Fromage contient deux galettes de bœuf frais de 100% pesant un quart de livre qui sont chaudes, délicieusement juteuses et cuites à la commande. Les galettes de bœuf McDonald’s sont assaisonnées avec juste une pincée de sel et de poivre, grillées sur une plaque chauffante, puis garnies d'oignons émincés, de cornichons acidulés et de deux tranches de fromage fondant sur un pain aux graines de sésame.",
//                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
                MenuItem(
                    id = 5001,
                    name = "Menu Happy Meal Hamburger",
                    description = "Un hamburger juteux avec des frites adaptées aux enfants et votre choix d’accompagnement Happy Meal : tranches de pommes ou yaourt faible en gras Yoplait GO-GURT à la fraise. Ensuite, choisissez une boisson pour enfants : lait faible en gras à 1%, eau DASANI ou jus biologique Honest Kids Appley Ever After.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_hamburger_happy_meal.png",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
                MenuItem(
                    id = 6002,
                    name = "Sundae au Chocolat Chaud",
                    description = "Notre sundae au chocolat chaud classique est fait avec une crème glacée molle à la vanille crémeuse et nappée de sauce au chocolat chaud.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_hot_fudge_sundae.png",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
//                MenuItem(
//                    id = 6006,
//                    name = "McFlurry avec des Biscuits OREO",
//                    description = "Le McFlurry avec des Biscuits OREO de McDonald’s est une combinaison populaire de morceaux de biscuits OREO et de crème glacée molle à la vanille !",
//                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_mcflurry_with_oreo_cookies.png",
//                    price = getRandomPrice(),
//                    categoryId = 6
//                ),
            ),
            recommendedMenuItems = listOf(
                MenuItem(
                    id = 4001,
                    name = "Menu Big Mac",
                    description = "Le seul et unique Menu Big Mac de McDonald’s. Les ingrédients du Big Mac comprennent un pain classique aux graines de sésame, la sauce Big Mac, du fromage américain et des cornichons tranchés. Le Menu Big Mac est servi avec nos célèbres frites et votre choix de boisson gazeuse Coca-Cola.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_big_mac_combo_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Menu Double Quarter Pounder avec Fromage",
                    description = "Obtenez le double de la saveur de bœuf frais avec un Double Quarter Pounder avec Fromage fait avec du bœuf frais cuit à la commande. Servi avec nos célèbres frites et votre choix de boisson gazeuse.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4006,
                    name = "Menu Filet-O-Fish",
                    description = "Un menu classique de sandwich au poisson fait avec du colin d'Alaska pêché dans la nature sur un pain régulier de McDonald’s, servi avec nos célèbres frites et votre choix de boisson gazeuse. Savourez un Menu Filet-O-Fish aujourd'hui.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_filet_o_fish_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
//                MenuItem(
//                    id = 1004,
//                    name = "Quarter Pounder avec Fromage Deluxe",
//                    description = "Le Quarter Pounder avec Fromage Deluxe est une nouvelle version d'un burger Quarter Pounder classique. La laitue croquante et trois tranches de tomates Roma garnissent un ¼ lb de bœuf frais 100% McDonald’s, chaud, délicieusement juteux et cuit à la commande. Assaisonné avec juste une pincée de sel et de poivre et grillé sur notre plaque chauffante. Garni de deux tranches de fromage américain fondant, de mayo crémeuse, d'oignons émincés et de cornichons acidulés sur un pain hamburger moelleux aux graines de sésame.",
//                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese_deluxe.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
                MenuItem(
                    id = 5001,
                    name = "Menu Happy Meal Hamburger",
                    description = "Un hamburger juteux avec des frites adaptées aux enfants et votre choix d’accompagnement Happy Meal : tranches de pommes ou yaourt faible en gras Yoplait GO-GURT à la fraise. Ensuite, choisissez une boisson pour enfants : lait faible en gras à 1%, eau DASANI ou jus biologique Honest Kids Appley Ever After.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_hamburger_happy_meal.png",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
//                MenuItem(
//                    id = 6002,
//                    name = "Sundae au Chocolat Chaud",
//                    description = "Notre sundae au chocolat chaud classique est fait avec une crème glacée molle à la vanille crémeuse et nappée de sauce au chocolat chaud.",
//                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_hot_fudge_sundae.png",
//                    price = getRandomPrice(),
//                    categoryId = 6
//                ),
            )
        )
    }
    private fun getRandomPrice(): Double {
        return (1..10).random() + listOf(0.49, 0.99).random()
    }

}
