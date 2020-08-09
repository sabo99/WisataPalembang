package com.alvin.wisatapalembang;


import java.util.ArrayList;

public class WisataData {

    private static String [] name = {
            "Benteng Kuto Besak",
            "Pulau Kemaro",
            "Taman Punti Kayu",
            "Bukit Siguntang",
            "Kampung Arab Al Munawar",
            "Museum Al-Quran Al-Akbar",
            "Museum Sultan Mahmud Badaruddin II",
            "Museum Balaputra Dewa",
            "Jakabaring Sport City",
            "Taman Purbakala Kerajaan Sriwijaya"
    };

    private static String [] add = {
            "Jl. Sultan Mahmud Badarudin, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30113",
            "1 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan",
            "Jalan Kol. Burlian Km. 6,5, Karya Baru, Alang Alang Lebar, Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30961",
            "Bukit Lama, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30137",
            "Munawar, Lrg. Al Haddad No.13, 13 Ulu, Seberang Ulu II, Palembang City, South Sumatra 30115",
            "Jl. Moh. Amin, Gandus, Kec. Gandus, Kota Palembang, Sumatera Selatan 30149",
            "Jl. Sultan Mahmud Badarudin, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30113",
            "Sukaramai, Jl. Srijaya No.I, RW.5, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30139",
            "15 Ulu, Seberang Ulu I, Palembang City, South Sumatra 30267",
            "Jl. Syakyakirti, Karang Anyar, Kec. Gandus, Kota Palembang, Sumatera Selatan"
    };

    private static int [] img = {
            R.drawable.bkb,
            R.drawable.kemaro,
            R.drawable.puntikayu,
            R.drawable.bukitseguntang,
            R.drawable.kampungarab,
            R.drawable.museumalquran,
            R.drawable.museumsultanmb2,
            R.drawable.museumbalaputradewa,
            R.drawable.jakabaring,
            R.drawable.slide5 // Taman purbakala Sriwijaya
    };


    private static String [] desk = {
            "Kuto Besak adalah bangunan keraton yang pada abad XVIII menjadi pusat Kesultanan Palembang. Gagasan mendirikan Benteng Kuto Besak diprakarsai oleh Sultan Mahmud Badaruddin I yang memerintah pada tahun 1724-1758 dan pelaksanaan pembangunannya diselesaikan oleh penerusnya yaitu Sultan Mahmud Bahauddin yang memerintah pada tahun 1776-1803. Sultan Mahmud Bahauddin ini adalah seorang tokoh kesultanan Palembang Darussalam yang realistis dan praktis dalam perdagangan internasional, serta seorang agamawan yang menjadikan Palembang sebagai pusat sastra agama di Nusantara. Menandai perannya sebagai sultan, ia pindah dari Keraton Kuto Lamo ke Kuto Besak. Belanda menyebut Kuto Besak sebagai nieuwe keraton alias keraton baru.\n" +
                    "Keraton ini berdiri di tanah yang luas, berbentuk persegi panjang menghadap ke Sungai Musi, panjangnya 274,32 meter, dan lebar 182,88 meter. Dikelilingi tembok besar, tingginya mencapai 9,14 meter, tebal 2,13 meter, dengan empat kubu (bastion di setiap sudutnya). dengan sejumlah meriam yang terbuat dari besi dan kuningan. Keraton memiliki pelataran yang luas, balai agung, gerbang besar. Di dalamnya terdapat pula keputren, paseban, ruang tempat menerima tamu, tempat kediaman sultan dan permaisuri. Di tengah keraton terdapat kolam dengan perahu, taman, dan pohon buah-buahan. Di antara keraton Kuto Besak dan keraton Lamo, terdapat jalan menuju mesjid utama kerajaan.\n"

            , "Pulau Kemaro, merupakan sebuah delta kecil di Sungai Musi, terletak sekitar 6 km dari Jembatan Ampera. Pulau Kemaro terletak di daerah industri, yaitu di antara Pabrik Pupuk Sriwijaya dan Pertamina Plaju dan Sungai Gerong. Posisi Pulau Kemaro adalah agak ke timur dari pusat Kota Palembang.\n" +
            "Pulau kemaro memiliki luas ±79 Ha dengan ketinggian 5 m dpl, Selain memiliki pesona alam yang indah, pulau Kemaro identik dengan kota Cina dan masyarakat Tiong Hoa serta adat istiadat dan kehidupan asli masyarakat Palembang. Daya tarik wisata sejarah yang ada di pulau Kemaro berupa adanya peninggalan-peninggalan sejarah (Pagoda berlantai 9, Makam putri Sriwijaya, Klenteng Hok Tjing Rio, Kuil Buddha, pertunjukkan kesenian, dan ritual keagamaan khususnya umat Tridharma). Sejarah Pulau Kemaro sudah ada sejak Kerajaan Sriwijaya yang erat kaitannya dengan kisah putri dari raja Kerajaan Sriwijaya dan putra raja Kerajaan Tiongkok, dari legenda itulah muncul sebuah Pulau yang dikenal dengan sebutan Pulau Kemaro. Yang mana arti dari pulau kemaro adalah pulau yang kemarau (pulau yang tidak pernah tenggelam ketika sungai Musi sedang pasang).\n"

            , "Taman Wisata Alam (TWA) Punti Kayu adalah sebuah kawasan pelestarian alam yang dimanfaatkan untuk kegiatan pariwisata alam dan rekreasi di Palembang, Sumatra Selatan . Terletak di tengah kota Palembang - tepatnya di kawasan Km.7 Palembang, Punti Kayu menjadi tempat liburan favorit yang ramai dikunjungi warga kota Palembang khususnya pada akhir pekan dan hari-hari libur. Kawasan ini dilengkapi dengan fasilitas flying fox, taman bermain, miniatur 7 keajaiban dunia, danau, waterpark, dan berbagai hiburan lainnya.\n" +
            "Punti Kayu merupakan hutan pinus dalam kota terbesar di Indonesia. Selain menjadi tempat favorit wisata tengah kota, Punti Kayu berkontribusi dalam penyerapan karbon dioksida dan mengimbangi pembangunan kota Palembang yang cukup pesat. Lebih dari 80% lahan Punti Kayu adalah lahan konservasi yang hingga saat ini masih sangat terjaga\n"

            , "Bukit Seguntang atau kadang disebut juga Bukit Siguntang adalah sebuah bukit kecil\n" +
            "setinggi 29—30 meter dari permukaan laut yang terletak sekitar 3 kilometer dari tepian utara Sungai Musi dan masuk dalam wilayah kota Palembang, Sumatera Selatan. Secara administratif situs ini termasuk kelurahan Bukit Lama, Kecamatan Ilir Barat I, Palembang. Bukit ini berjarak sekitar 4 kilometer di sebelah barat daya pusat kota Palembang, dapat dicapai dengan menggunakan angkutan umum menuju jurusan Bukit Besar\n" +
            "Di lingkungan sekitar bukit ini ditemukan beberapa temuan purbakala yang dikaitkan dengan kerajaan Sriwijaya yang berjaya sekitar kurun abad ke-6 sampai ke-13 masehi. Di puncak bukit ini terdapat beberapa makam yang dipercaya sebagai leluhur warga Palembang. Oleh masyarakat setempat, kompleks ini dianggap keramat dan menjadi tempat tujuan ziarah. Kini Kawasan ini menjadi Taman Purbakala untuk menjaga artefak-artefak yang mungkin masih belum terungkap.\n"

            , "Kampung Arab Al Munawar terletak di kota Palembang, kampung di Sumatra Selatan yang menarik. Bukan hanya karena tergolong tua, destinasi wisata ini nilai sejarahnya juga tak luput dari perhatian. Desa wisata yang terletak di tepi Sungai Musi yang disebut \"Laot\" atau laut oleh masyarakt, kampung ini memiliki banyak kejutan dan pesona.Di kampung ini terdapat berbagai keturunan diantaranya ada keturunan Assegaf, Al-Habsy, Al-Kaaf, Hasny, Syahab. Kampung yang menjadi pusat wisata ini " +
            "pada tahun 2018 sempat diubah dengan menarik untuk menonjolkan wisata di daerah sana. Pada ajang Asian Games 2018 kampung ini dirubah untuk lebih memperkenalkan etnis dan budaya keturunan Arab di lingkungan masyarakat."

            , "Al Quran Al-Akbar atau yang juga sering disebut Al Quran Raksasa yang berada di kota Palembang beralamat di Pondok Pesantren Al Ihsaniyah Gandus Palembang. Terdapat 30 juz ayat suci Al-Quran yang berhasil dipahat/diukir ala khas Palembang dalam lembar kayu dan menghabiskan kurang lebih 40 meter kubik kayu tembesu dengan biaya tidak kurang Rp 2 miliar, dimana masing-masing lembar ukuran halamannya 177 x 140 x 2,5 sentimeter dan tebal keseluruhannya termasuk sampul mencapai 9 meter. \n" +
            "Al-Quran yang terdiri dari 630 halaman ini juga dilengkapi dengan tajwid serta doa khataman bagi pemula. Setiap lembar terpahat ayat suci Al-Quran pada warna dasar kayu coklat dengan huruf arab timbul warna kuning dengan ukiran motif kembang di bagian tepi ornamen khas Palembang yang sangat indah di pandang dan enak dibaca. Proses pembuatannya sendiri memakan waktu relatif lama, sekitar tujuh tahunan."

            , "Museum Sultan Mahmud Badaruddin II adalah museum di kota Palembang, Sumatra Selatan, Indonesia. Museum ini didirikan di bekas bangunan rumah residen kolonial Sumatra Selatan abad ke-19. Bangunan ini juga menjadi gedung dinas pariwisata Palembang. " +
            "Lokasi museum ini awalnya adalah lokasi Kuta Lama, istana tua Sultan Mahmud Badaruddin I (1724–1758), penguasa Kesultanan Palembang. Setelah penghapusan Kesultanan Palembang, istana Kuta Lama dihancurkan oleh pemerintah kolonial Inggris pada 7 Oktober 1823. Penghapusan Kesultanan adalah bentuk hukuman yang dijatuhkan oleh pemerintah kolonial Inggris terhadap Kesultanan Palembang akibat pembantaian yang terjadi di penginapan Belanda Sungai Alur, meskipun ini mungkin telah menjadi gerakan politik untuk menghapus kedaulatan Kesultanan atas kota tersebut."

            , "Museum Balaputra Deva atau secara resmi disebut Museum Negeri Provinsi Sumatra Selatan \"Balaputra Dewa\", adalah sebuah museum etnografi yang terletak di Palembang, Indonesia. Museum ini adalah museum negeri Provinsi Sumatra Selatan. Nama Balaputra Dewa adalah berasal dari Balaputra, raja Sriwijaya abad ke-9 dan mantan kepala dinasti Sailendra yang berpusat di sekitar Palembang. Balaputra Dewa menampilkan sejarah dan tradisi dari provinsi Sumatra Selatan. " +
            "Museum Balaputra Dewa adalah salah satu dari apa yang disebut Museum Negeri Indonesia, yang mewakili masing-masing provinsi di Indonesia. Pembangunan museum dimulai pada tahun 1978 dan bangunannya diresmikan pada tanggal 5 November 1984. Keputusan untuk nama \"Balaputra Dewa\" didasarkan pada India abad ke-9 berdaulat Balaputra yang tercatat dalam prasasti yang ditemukan di Nalanda, India. Prasasti Nalanda menyebutkan hubungannya dengan membangun sebuah biara Buddha di bawah sponsornya. Kedua namanya disebutkan ditemukan di prasasti di Jawa pada abad ke-9 masehi yang berkaitan kekalahannya di Jawa atas Rakai Pikatan, seorang penguasa dari dinasti Sanjaya, yang diminta Balaputra untuk meninggalkan Jawa untuk menetap di tempat yang sekarang kota Palembang, Sumatra Selatan."

            ,"Jakabaring Sport City (JSC) atau Kompleks Olahraga Jakabaring adalah kompleks dari berbagai fasilitas olahraga di Palembang, Sumatra Selatan, Indonesia. Kompleks di atas lahan seluas 325 hektar ini terletak di wilayah Seberang Ulu sejauh 5 km dari pusat kota Palembang. Kompleks olahraga ini merupakan tempat penyelenggaraan PON XVI 2004 dan SEA Games XXVI 2011. Di dalam kompleks ini terdapat Stadion Gelora Sriwijaya, stadion berkapasitas 40 ribu orang yang merupakan stadion terbesar ketiga se-Indonesia setelah Stadion Utama Gelora Bung Karno dan Stadion Utama Palaran. Kompleks olahraga ini juga akan menjadi tempat sekunder untuk penyelenggaraan Asian Games 2018. " +
            "Jakabaring dahulu adalah daerah sepi dan ditakuti, sementara sebagian besar wilayahnya adalah rawa. Kesan sebagai wilayah sepi dan rawan kejahatan pun melekat pada Jakabaring. Kawasan yang sempat dikenal dengan sisi negatifnya ini lantas mulai berbenah ketika Pemkot berencana mengubah kawasan yang sebelumnya terkenal dengan hal mistis ini menjadi komplek olahraga baru yang modern dan bertaraf Internasional. \n" +
            "Pembangunan stadion impian dengan kapasitas hingga 40 ribu kursi dimulai pada 2001. Tak hanya lapangan sepak bola, stadion yang juga dikenal dengan nama Gelora Sriwijaya ini juga memiliki fasilitas lain seperti lintasan lari, serta fasilitas olahraga atletik lainnya. "

            ,"Taman Purbakala Kerajaan Sriwijaya atau sebelumnya dikenal dengan nama Situs Karanganyar adalah taman purbakala bekas kawasan permukiman dan taman yang dikaitkan dengan kerajaan Sriwijaya yang terletak tepi utara Sungai Musi di kota Palembang, Sumatra Selatan. Di kawasan ini ditemukan jaringan kanal, parit dan kolam yang disusun rapi dan teratur yang memastikan bahwa kawasan ini adalah buatan manusia, sehingga dipercaya bahwa pusat kerajaan Sriwijaya di Palembang terletak di situs ini. Di kawasan ini ditemukan banyak peninggalan purbakala yang menunjukkan bahwa kawasan ini pernah menjadi pusat permukiman dan pusat aktivitas manusia. " +
            "Secara administratif, situs Karanganyar terletak di Jalan Syakhyakirti, Kelurahan Karanganyar, Kecamatan Gandus, Palembang.[1] Terletak pada dataran aluvial pada meander Sungai Musi berhadapan dengan pertemuan sungai Musi dengan sungai Ogan dan Kramasan. Belahan utara Sungai Musi sudah sejak lama diketahui sebagi lokasi sejumlah situs arkeologi yang berasal dari abad ke-7 hingga ke-15 masehi, di antaranya adalah situs Kambang Unglen, Padang Kapas, Ladang Sirap, dan Bukit Seguntang yang terletak dekat dengan situs Karanganyar."
    };


    public static ArrayList<Wisata> getListWisata(){
        ArrayList<Wisata> listWisata = new ArrayList<>();

        for(int i=0; i<name.length; i++){

            Wisata w = new Wisata();
            w.setName(name[i]);
            w.setAddress(add[i]);
            w.setImg(img[i]);
            w.setDesk(desk[i]);
            listWisata.add(w);
        }
        return listWisata;
    }
}
