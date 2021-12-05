package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Cacing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ular;
import simple.example.hewanpedia.model.Ulat;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("Sanca", "Sepit",
                "Sanca adalah sebutan umum untuk semua jenis ular pembelit yang diklasifikasikan sebagai familia Pythonidae. Sanca tersebar luas di daerah beriklim panas dan tropis Afrika, Asia, dan Australia. Salah satu spesies sanca, yaitu sanca kembang merupakan ular terpanjang di dunia.", R.drawable.ular1));
        ulars.add(new Ular("Anakonda", "Keruak",
                "Anakonda adalah golongan ular besar yang endemik di perairan tawar dan sungai-sungai di daerah tropis Amerika Selatan.", R.drawable.ular2));
        ulars.add(new Ular("Lamperpoltis", "Sakra",
                "Lampropeltis adalah nama genus ular kolubrid yang terdapat di Amerika. Nama ilmiahnya, Lampropeltis=\"sisik bercahaya\" berasal dari kata Lampros=\"cahaya\" dan pelt=\"perisai\", merujuk pada sisik kulit mereka yang mengkilap.", R.drawable.ular3));
        ulars.add(new Ular("Mamba", "Gawah Gadung",
                "Mamba adalah sebutan umum untuk empat spesies ular berbisa mematikan yang semuanya diklasifikasikan sebagai genus Dendroaspis. Ular-ular ini endemik di Benua Afrika dan beberapa jenisnya mendapat reputasi sebagai ular yang paling mematikan di dunia.", R.drawable.ular4));
        return ulars;
    }


    private static List<Cacing> initDataCacing(Context ctx) {
        List<Cacing> cacings = new ArrayList<>();
        cacings.add(new Cacing("Trichuris trichiura", "Ciptaan Tuhan",
                "Cacing bernama latin Trichuris trichiura ini memiliki panjang 5 cm pada betina dan 4 cm pada jantan. Cacing ini hidup di usus besar lalu saat jadi cacing dewasa akan menempel di dinding usus halus dan menghisap darah. Biasanya akan menimbulkan sakit perut, nafsu makan berkurang, dan anemia.",R.drawable.cacing1));
        cacings.add(new Cacing("Cacing Gelang", "Ciptaan Tuhan",
                "Cacing gelang satu ini bisa dikatakan panjang, yang betina sekitar 22-35 cm, sementara jantan 10-30 cm. Cacing bernama latin Ascaris lumbricoides ini hidupnya di usus halus kemudian menyerap sari-sari makanan yang ada di dalamnya. Lalu, cacing ini bisa jalan-jalan ke paru-paru sehingga menyebabkan anak batuk-batuk.",R.drawable.cacing2));
        cacings.add(new Cacing("Cacing Americanus","nederland",
                "Cacing ini terdiri dari dua jenis, yakni Necator americanus dan Ancylostoma duodenale panjangnya sekitar 0,8-1 cm. Larva cacing ini mampu masuk ke dalam tubuh melalui pori-pori kulit lalu masuk ke aliran darah. Kemudian hidup di usus halus. Cacing yang satu ini mampu menggigit usus sehingga bisa menghisap darah yang jumlahnya lebih banyak dibanding", R.drawable.cacing3));
        cacings.add(new Cacing("Cacing Entrobius", "amerika serikat barat",
                "Bernama latin Enterobius vermicularis ini ukurannya kecil sekali, yang jantan 2-5 mm pada jantan dan betina sekitar 8-13 mm. Mereka biasanya hidup di usus besar dan membuat dubur gatal.", R.drawable.cacing4));
        return cacings;
    }
    private static List<Ulat> initDataUlat(Context ctx) {
        List<Ulat> ulats = new ArrayList<>();
        ulats.add(new Ulat("Ulat Harimau Isabela", "Papua",
                "Pyrrharctia isabella, ngengat harimau isabella, yang bentuk larvanya disebut beruang wol berpita, beruang berbulu, atau cacing wol, hidup di Amerika Serikat dan Kanada bagian selatan. Ini pertama kali secara resmi dinamai oleh James Edward Smith pada tahun 1797.", R.drawable.ulat1));
        ulats.add(new Ulat("Ulat Processionary", "Hutan Oak",
                "Processionary adalah ngengat yang ulat dapat ditemukan di hutan oak, di mana mereka memakan daun oak, menyebabkan kerusakan yang signifikan. Mereka melakukan perjalanan dalam prosesi hidung-ke-ekor, seringkali berkepala panah, dengan seorang pemimpin diikuti oleh barisan beberapa ulat.", R.drawable.ulat2));
        ulats.add(new Ulat("Ulat Arna Peseudoconspersa", "Jepang",
                "Arna pseudoconspersa, ngengat teh tussock atau ngengat ekor coklat Jepang, adalah ngengat dari famili Erebidae. Spesies ini pertama kali dideskripsikan oleh Embrik Strand pada tahun 1914.", R.drawable.ulat3));
        ulats.add(new Ulat("Ulat Manduca Sexta", "Amerika",
                "Manduca sexta adalah ngengat dari famili Sphingidae yang kini banyak dijumpai di benua Amerika. Umumnya dikenal sebagai ngengat Carolina sphinx dan ulat tanduk tembakau.", R.drawable.ulat4));

        return ulats;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataCacing(ctx));
        hewans.addAll(initDataUlat(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}