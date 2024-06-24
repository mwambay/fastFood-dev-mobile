package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.model.MenuItem

object MenuRepository {

    fun getMenuData(): Menu {
        return Menu(
            categories = CategoriesRepository.getCategoriesData(),
            menuItems = listOf(
                MenuItem(
                    id = 1001,
                    name = "Big Mac",
                    description = "La perfection alléchante commence avec deux galettes de boeuf 100% pur et une sauce Big Mac, pris en sandwich entre un pain aux graines de sésame. Il est garni de cornichons, de laitue râpée croustillante, d'oignons finement hachés et de fromage américain.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_big_mac.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1002,
                    name = "Quarter Pounder avec Fromage",
                    description = "Chaque burger Quarter Pounder avec Fromage contient une galette de ¼ lb. de boeuf frais 100% qui est chaud, délicieusement juteux et cuit à la commande. Il est assaisonné avec juste une pincée de sel et de poivre, grillé sur une plaque de fer, puis garni d'oignons tranchés, de cornichons acidulés et de deux tranches de fromage fondant sur un pain aux graines de sésame.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1003,
                    name = "Double Quarter Pounder avec Fromage",
                    description = "Chaque Double Quarter Pounder avec Fromage contient deux galettes de burger de 100% boeuf frais, chaud, délicieusement juteux et cuit à la commande. Les galettes de boeuf de McDonald’s sont assaisonnées avec juste une pincée de sel et de poivre, grillées sur une plaque de fer, puis garnies d'oignons tranchés, de cornichons acidulés et de deux tranches de fromage fondant sur un pain aux graines de sésame.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1004,
                    name = "Quarter Pounder avec Fromage Deluxe",
                    description = "Le Quarter Pounder avec Fromage Deluxe est une nouvelle version d'un burger classique Quarter Pounder. De la laitue croquante et trois tranches de tomate Roma sur un ¼ lb. de boeuf frais McDonald’s, chaud, délicieusement juteux et cuit à la commande. Assaisonné avec juste une pincée de sel et de poivre et grillé sur notre plaque de fer. Garnie de deux tranches de fromage américain fondant, de mayonnaise crémeuse, d'oignons tranchés et de cornichons acidulés sur un pain hamburger moelleux et doux aux graines de sésame.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese_deluxe.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1005,
                    name = "McDouble",
                    description = "Un burger double classique de McDonald’s, le McDouble empile deux galettes de boeuf 100% pur assaisonnées avec juste une pincée de sel et de poivre. Il est garni de cornichons acidulés, d'oignons hachés, de ketchup, de moutarde et d'une tranche de fromage américain fondant.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_mcdouble.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1006,
                    name = "Quarter Pounder avec Fromage et Bacon",
                    description = "Chaque Quarter Pounder avec Fromage et Bacon contient du bacon fumé coupé épais sur un ¼ lb. de boeuf frais McDonald’s, cuit à la commande. C’est un burger au bacon chaud et délicieusement juteux, assaisonné avec juste une pincée de sel et de poivre et grillé sur notre plaque de fer. Garni de deux tranches de fromage américain fondant, d'oignons tranchés et de cornichons acidulés sur un pain hamburger moelleux et doux aux graines de sésame.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese_bacon.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1007,
                    name = "Cheeseburger",
                    description = "Notre cheeseburger simple et classique commence avec une galette de boeuf 100% pur assaisonnée avec juste une pincée de sel et de poivre. Il est garni d'un cornichon acidulé, d'oignons hachés, de ketchup, de moutarde et d'une tranche de fromage américain fondant.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_cheeseburger.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1008,
                    name = "Double Cheeseburger",
                    description = "Le Double Cheeseburger de McDonald’s contient deux galettes de boeuf 100% pur assaisonnées avec juste une pincée de sel et de poivre. Il est garni de cornichons acidulés, d'oignons hachés, de ketchup, de moutarde et de deux tranches de fromage américain fondant.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_double_cheeseburger.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1009,
                    name = "Hamburger",
                    description = "Le burger original commence avec une galette de boeuf 100% pur assaisonnée avec juste une pincée de sel et de poivre, puis garni d'un cornichon acidulé, d'oignons hachés, de ketchup et de moutarde.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_hamburger.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1010,
                    name = "McChicken",
                    description = "Le McChicken est un sandwich au poulet croustillant et délicieux avec un filet de poulet croustillant garni de mayonnaise, de laitue iceberg râpée, et servi sur un pain parfaitement grillé.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_mcchicken.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1011,
                    name = "Filet-O-Fish",
                    description = "Plongez dans notre Filet-O-Fish pêché dans la nature ! Sourced from sustainable fisheries, garni de fromage américain fondant et de sauce tartare crémeuse, et servi sur un pain moelleux et cuit à la vapeur.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_filet_o_fish.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 2001,
                    name = "Petites Frites",
                    description = "Nos célèbres frites sont faites avec des pommes de terre de qualité supérieure telles que la Russet Burbank et la Shepody. Avec 0g de gras trans par portion étiquetée, ces frites épiques sont croustillantes et dorées à l'extérieur et moelleuses à l'intérieur.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_small_french_fries.png",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 2002,
                    name = "Frites Moyennes",
                    description = "Nos célèbres frites sont faites avec des pommes de terre de qualité supérieure telles que la Russet Burbank et la Shepody. Avec 0g de gras trans par portion étiquetée, ces frites épiques sont croustillantes et dorées à l'extérieur et moelleuses à l'intérieur.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_medium_french_fries.png",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 2003,
                    name = "Grande Frites",
                    description = "Nos célèbres frites sont faites avec des pommes de terre de qualité supérieure telles que la Russet Burbank et la Shepody. Avec 0g de gras trans par portion étiquetée, ces frites épiques sont croustillantes et dorées à l'extérieur et moelleuses à l'intérieur.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_large_french_fries.png",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 3001,
                    name = "Coca-Cola",
                    description = "Coca-Cola® est une boisson emblématique avec un goût rafraîchissant. 150 calories dans chaque portion de 16 oz. ",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_coca_cola.png",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3002,
                    name = "Sprite",
                    description = "Sprite® est une boisson gazeuse citron-lime sans caféine. Un classique rafraîchissant pour toute occasion.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_sprite.png",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3003,
                    name = "Fanta Orange",
                    description = "Fanta® Orange est une boisson gazeuse fruitée et rafraîchissante. Avec sa saveur d'orange audacieuse, c'est une boisson favorite pour tous les âges.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_fanta_orange.png",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 4001,
                    name = "McFlurry Oreo",
                    description = "Le McFlurry Oreo est une combinaison irrésistible de glace à la vanille douce mélangée à des morceaux de biscuits Oreo croquants.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_mcflurry_oreo.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4002,
                    name = "Sundae au Caramel",
                    description = "Notre Sundae au Caramel est une délicieuse portion de glace à la vanille garnie de notre riche sauce caramel.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_caramel_sundae.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4003,
                    name = "Sundae au Chocolat",
                    description = "Notre Sundae au Chocolat est une délicieuse portion de glace à la vanille garnie de notre sauce chocolat riche et fondante.",
                    image = "https://raw.githubusercontent.com/mwambay/projet-dev-mobile/main/res/drawable-nodpi/" + "menu_item_chocolate_sundae.png",
                    price = getRandomPrice(),
                    categoryId = 4
                )
            )
        )
    }

    private fun getRandomPrice(): Double {
        return (1..10).random() + listOf(0.49, 0.99).random()
    }
}
