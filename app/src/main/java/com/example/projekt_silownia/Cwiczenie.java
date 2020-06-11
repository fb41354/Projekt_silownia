package com.example.projekt_silownia;

public class Cwiczenie {

    private String nazwa;
    private int opis;
    private int obraz_id;
    private int film_id;

    public static  final  Cwiczenie [] cwiczenia_poziom_1 =
    {
            new Cwiczenie("Kolana do klatki", R.string.opis_cw_1, R.drawable.poziom1_kolana_do_klatki, R.raw.poziom1_kolana_do_klatki),
            new Cwiczenie("Opuszczanie na drazku", R.string.opis_cw_2, R.drawable.poziom1_opusczanie_na_drazku, R.raw.poziom1_opusczanie_na_drazku),
            new Cwiczenie("Podciaganie Mlotkowe", R.string.opis_cw_3, R.drawable.poziom1_podciaganie_mlotkowe, R.raw.poziom1_podciaganie_mlotkowe),
            new Cwiczenie("Pompka na poreczach", R.string.opis_cw_4, R.drawable.poziom1_pompka_na_poreczach, R.raw.poziom1_pompka_na_poreczach),
            new Cwiczenie("Ugiete nogi do klatki", R.string.opis_cw_5, R.drawable.poziom1_ugiete_nogi_do_klatki, R.raw.poziom1_ugiete_nogi_do_klatki),
            new Cwiczenie("Dipy", R.string.opis_cw_5, R.drawable.poziom1_dipy, R.raw.poziom1_dipy),
    };

    public static  final  Cwiczenie [] cwiczenia_poziom_2 =
            {
                    new Cwiczenie("Dipy", R.string.opis_cw_1, R.drawable.poziom2_dipy, R.raw.poziom2_dipy),
                    new Cwiczenie("Podciaganie nachwytem", R.string.opis_cw_2, R.drawable.poziom2_podciagniecie_nachwytem, R.raw.poziom2_podciagniecie_nachwytem),
                    new Cwiczenie("Podciaganie podchwytem", R.string.opis_cw_3, R.drawable.poziom2_podciagniecie_podchwytem, R.raw.poziom2_podciagniecie_podchwytem),
                    new Cwiczenie("Pompka na poreczach", R.string.opis_cw_4, R.drawable.poziom2_pompka_na_poreczach, R.raw.poziom2_pompka_na_poreczach),
                    new Cwiczenie("Proste nogi do 90", R.string.opis_cw_5, R.drawable.poziom2_proste_nogi_do_90, R.raw.poziom2_proste_nogi_do_90),
                    new Cwiczenie("Proste nogi do kata", R.string.opis_cw_5, R.drawable.poziom2_proste_nogi_do_kata, R.raw.poziom2_proste_nogi_do_kata),
            };

    public static  final  Cwiczenie [] cwiczenia_poziom_3 =
            {
                    new Cwiczenie("Glebokie dipy", R.string.opis_cw_1, R.drawable.poziom3_glebokie_dipy, R.raw.poziom3_glebokie_dipy),
                    new Cwiczenie("Pelna pompka na poreczach", R.string.opis_cw_2, R.drawable.poziom3_pelna_pompka_na_poreczach, R.raw.poziom3_pelna_pompka_na_poreczach),
                    new Cwiczenie("Podciaganie nachwytem", R.string.opis_cw_3, R.drawable.poziom3_podciagniecie_nachwytem, R.raw.poziom3_podciagniecie_nachwytem),
                    new Cwiczenie("Podciaganie podchwytem", R.string.opis_cw_4, R.drawable.poziom3_podciagniecie_podchwytem, R.raw.poziom3_podciagniecie_podchwytem),
                    new Cwiczenie("Proste nogi do drazka", R.string.opis_cw_5, R.drawable.poziom3_proste_nogi_do_drazka, R.raw.poziom3_proste_nogi_do_drazka),
            };


    Cwiczenie(String nazwa, int opis, int obraz_id, int film_id)
    {
        this.nazwa = nazwa;
        this.opis = opis;
        this.film_id = film_id;
        this.obraz_id = obraz_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getObraz_id() {
        return obraz_id;
    }

    public int getOpis() {
        return opis;
    }

    public String toString()
    {
        return this.nazwa;
    }

}
