public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu(
            "PANCAKE HOUSE MENU",
            "Breakfast"
        );
        MenuComponent dinerMenu = new Menu(
            "DINER MENU",
            "Lunch"
        );
        MenuComponent cafeMenu = new Menu(
            "CAFE MENU",
            "Dinner"
        );
        MenuComponent dessertMenu = new Menu(
            "DESSERT MENU",
            "Dessert"
        );

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
            "Pasta",
            "Delicious Pasta with White Sauce or Red Sauce",
            10.45,
            true
        ));
        pancakeHouseMenu.add(new MenuItem(
            "Noodles",
            "Delicious Noodles with White Sauce or Red Sauce",
            8.45,
            true
        ));
        pancakeHouseMenu.add(dessertMenu);


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}