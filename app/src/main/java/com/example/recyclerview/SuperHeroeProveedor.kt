package com.example.recyclerview

class SuperHeroeProveedor {
    companion object{
        val listaSuperHeroes = listOf<SuperHeroe>(
            SuperHeroe(
                "Batman",
                "DC Comics",
                "Bruce Wayne",
                "https://cdn.businessinsider.es/sites/navi.axelspringer.es/public/media/image/2022/03/batman-comics-2636505.jpg?tf=3840x"
            ),
            SuperHeroe(
                "Superman",
                "DC Comics",
                "Clark Kent",
                "https://i0.wp.com/imgs.hipertextual.com/wp-content/uploads/2022/04/superman.jpeg?fit=1200%2C750&quality=50&strip=all&ssl=1"
            ),
            SuperHeroe(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://lumiere-a.akamaihd.net/v1/images/marvelspidermanseries-emeagrid_45274dc0.jpeg?region=240,0,480,480"
            ),
            SuperHeroe(
                "Dare Devil",
                "Marvel",
                "Matthew Murdock",
                "https://static.wikia.nocookie.net/marveldatabase/images/a/aa/Daredevil_Vol_6_21_Textless.jpg/revision/latest?cb=20200221001243"
            ),
        )
    }
}