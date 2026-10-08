package edu.iesam.superhero.feature.superhero.data.local

import edu.iesam.superhero.feature.superhero.domain.Superhero

class SuperheroMemLocalDataSource {
    private val imageBaseUrl =
        "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/"

    private val localSuperheroes = listOf(
        // Tus héroes originales (sin URL: usarán la imagen de prueba)
        Superhero("Superman", "1A", "1A-Superman", ""),
        Superhero("Spiderman", "1B", "1B-Spider-man", ""),
        Superhero("Green Lantern", "1C", "1C-Green-Lantern", ""),
        // Héroes reales de la API: la URL es imageBaseUrl + slug + ".jpg"
        Superhero("A-Bomb", "1", "1-a-bomb", "${imageBaseUrl}1-a-bomb.jpg"),
        Superhero("Abe Sapien", "2", "2-abe-sapien", "${imageBaseUrl}2-abe-sapien.jpg"),
        Superhero("Abin Sur", "3", "3-abin-sur", "${imageBaseUrl}3-abin-sur.jpg"),
        Superhero("Abomination", "4", "4-abomination", "${imageBaseUrl}4-abomination.jpg"),
        Superhero("Abraxas", "5", "5-abraxas", "${imageBaseUrl}5-abraxas.jpg"),
        Superhero("Absorbing Man", "6", "6-absorbing-man", "${imageBaseUrl}6-absorbing-man.jpg"),
        Superhero("Adam Monroe", "7", "7-adam-monroe", "${imageBaseUrl}7-adam-monroe.jpg"),
        Superhero("Adam Strange", "8", "8-adam-strange", "${imageBaseUrl}8-adam-strange.jpg"),
        Superhero("Agent Bob", "10", "10-agent-bob", "${imageBaseUrl}10-agent-bob.jpg"),
        Superhero("Agent Zero", "11", "11-agent-zero", "${imageBaseUrl}11-agent-zero.jpg"),
        Superhero("Air-Walker", "12", "12-air-walker", "${imageBaseUrl}12-air-walker.jpg"),
        Superhero("Ajax", "13", "13-ajax", "${imageBaseUrl}13-ajax.jpg"),
        Superhero("Alan Scott", "14", "14-alan-scott", "${imageBaseUrl}14-alan-scott.jpg"),
        Superhero("Alex Mercer", "15", "15-alex-mercer", "${imageBaseUrl}15-alex-mercer.jpg"),
        Superhero("Alfred Pennyworth", "17", "17-alfred-pennyworth", "${imageBaseUrl}17-alfred-pennyworth.jpg"),
        Superhero("Alien", "18", "18-alien", "${imageBaseUrl}18-alien.jpg"),
        Superhero("Amazo", "20", "20-amazo", "${imageBaseUrl}20-amazo.jpg")
    )

    fun getAll() = localSuperheroes
}