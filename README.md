# Map-harjoitustehtävät: postitoimipaikka ja postinumerot

Tämä Git-repositorio sisältää Eclipse-projektin, jota voit käyttää pohjana Map-harjoitusten tekemisessä. [Kloonaa tämä Git-repositorio itsellesi Eclipseen](https://www.google.com/search?q=git+clone+java+project+into+eclipse).

## Map-tietorakenne

Molemmissa tehtävissä tarvittava Map-tietorakenne luodaan valmiin `luePostinumerot()`-metodin avulla. Kyseinen metodi muodostaa [Postin postinumeroaineistosta](postinumerot.csv) Map-tietorakenteen, jossa postinumerot toimivat avaimina ja postitoimipaikkojen nimet toimivat arvoina:

```
{93830=Rukatunturi, 68874=Smartpost, 66210=Molpe, 87150=Kajaani, 92500=Rantsila ... }
```

Sekä avainten että arvojen tietotyyppi on `String`, eli metodin paluuarvo voidaan ottaa talteen `Map<String, String>`-tyyppiseen muuttujaan:

```java
Map<String, String> postinumeroMap = luePostinumerot();
```

## [Postitoimipaikka.java](src/Postitoimipaikka.java)

Lue käyttäjän syöttämä postinumero ja tulosta sitä vastaava postitoimipaikan nimi. Mikäli postinumeroa ei löydy aineistosta, tulosta teksti "Postinumeroa ei löytynyt."

Esimerkisuoritus:

```
Syötä postinumero: 00100
Helsinki
```

Tarkemman tehtävänannon sekä vinkit logiikan toteuttamiseksi löydät Ohjelmointi 2 -kurssin Viopesta.

## [Postinumerot.java](src/Postinumerot.java)

Lue käyttäjän syöttämä postitoimipaikan nimi ja tulosta kaikki postinumerot, jotka kuuluvat kyseiseen postitoimipaikkaan.

Tulosteessa postinumeroiden tulee olla kasvavassa järjestyksessä pilkuilla eroteltuna, joten kerää postinumerot ensin listalle, jonka järjestät ennen tulostamista.

Mikäli annetulle postitoimipaikalle ei löydy lainkaan postinumeroita, tulosta "Postinumeroita ei löytynyt."

Esimerkkisuoritus:

```
Syötä postitoimipaikka: Porvoo
Postinumerot: 06100, 06101, 06150, 06151, 06200, 06400, 06401, 06450, 06500
```

Tarkemman tehtävänannon sekä vinkit logiikan toteuttamiseksi löydät Ohjelmointi 2 -kurssin Viopesta.

# Postinumeroaineiston tekijänoikeudet

Tässä projektissa hyödynnettävä postinumeroaineisto [postinumerot.csv](postinumerot.csv) on muodostettu [https://github.com/theikkila/postinumerot](https://github.com/theikkila/postinumerot)-projektin [postcode_map_light.json](https://github.com/theikkila/postinumerot/blob/master/postcode_map_light.json)-tiedostosta 23.3.2021.

Datan tekijänoikeudet kuuluvat Postille ja niitä käytetään [Postin käyttöehtojen mukaisesti](https://www.posti.fi/fi/asiakastuki/postinumerotiedostot). Mikäli teet kopioita tästä aineistosta, huolehdi käyttöehtojen noudattamisesta.
