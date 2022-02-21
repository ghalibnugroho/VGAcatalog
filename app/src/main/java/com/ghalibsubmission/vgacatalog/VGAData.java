package com.ghalibsubmission.vgacatalog;
import java.util.ArrayList;

public class VGAData {
    private static String[] vgaNames = {
            "Aorus Gigabyte RTX 2080Ti Extreme Waterforce",
            "Asus ROG Strix RTX 2080Ti Call of Duty Black Ops 4 Edition",
            "Asus ROG Strix RTX 2080Ti Gaming OC",
            "MSI RTX 2080 Gaming X Trio",
            "Aorus Gigabyte RTX 2080 Super 8G",
            "Asus ROG Strix RTX 2080 Gaming OC",
            "Zotac RTX 2080 Super Twin",
            "Galax GTX 1660Ti OC Dual Fan",
            "Galax GTX 1060 OC",
            "Galax GTX 1060 EXOC",
            "Galax GTX 1050Ti EXOC"
    };

    private static String[] vgaHarga = {
            "Rp 28.600.000",
            "Rp 28.500.000",
            "Rp 24.100.000",
            "Rp 17.300.000",
            "Rp 16.750.000",
            "Rp 15.500.000",
            "Rp 15.500.000",
            "Rp 4.675.000",
            "Rp 4.000.000",
            "Rp 4.000.000",
            "Rp 2.800.000",
    };

    private static String[] vgaIntro = {
            "Powered by GeForce RTX™ 2080 Ti Integrated with 11GB GDDR6 352-bit memory interface WATERFORCE Water Block cooling system, 7 Video Outputs RGB Fusion 2.0 – synchronize with other AORUS devices Metal Back Plate with RGB AORUS LOGO Illumination Built for Extreme Overclocking 16+3 Power Phases 4 Years Warranty (Online registration required)",
            "The ROG Strix GeForce RTX™ 2080 Ti OC Call of Duty®: Black Ops 4 Edition sets the stage for epic gaming action by pairing NVIDIA®'s A-list GPU with gargantuan power delivery and cooling to ensure performance stays silky smooth no matter how frantic your playstyle.",
            "ROG GeForce RTX™ graphics cards are powered by the Turing ™ GPU architecture and the all-new RTX platform. This gives you up to 6X the performance of previous-generation graphics cards and brings the power of real-time ray tracing and AI to games.",
            "The GeForce RTX 20 Series GAMING TRIO is the return of MSI’s mighty three-fan graphics card. Only reserved for the most powerful of GPU’s, the TRIO Series features a mix of black and gunmetal grey with elegant shapes and a classy brushed metal backplate that matches the front. This looks great with the gorgeous RGB effects found on the front and the side of the card, which can be controlled using MSI’s Mystic Light software and made to synchronize with other RGB components.",
            "AORUS provides the all-around cooling solution for all key components of the graphics card. We take care not only GPU but also VRAM and MOSFET, to ensure a stable overclock operation and longer life. WINDFORCE STACK 3x 100mm cooling system is the most innovative cooling solution that provides the most efficient thermal performance for the graphics card. ",
            "The ROG Strix GeForce RTX™ 2080 teams up NVIDIA®'s A-list GPU with an elite cast of specialists, setting the stage for epic gaming action. Gargantuan power delivery provides the muscle to push overclocking boundaries, while cooling that's honed to perfection keeps the spotlight squarely on Turing™'s performance. And with an arsenal of utilities that allow you to customize and tweak this extreme hardware, you call the shots.",
            "Everything is super with the all-new ZOTAC GAMING GeForce RTX 20 Series SUPER graphics cards. Based on the NVIDIA Turing architecture, it’s packed with more cores and ultra-fast GDDR6 memory. Integrated with more smart and optimized technologies, get ready to GET FAST and GAME STRONG.",
            "Operating with dual 90 mm fans and fans stop, along with two high performance heat pipes, the components remain at a steady cool temperature, along with the performance that on the latest games. For better performance, the included 1 Click OC feature runs a process with just 1 button that will boost the highest stable overclock settings for customers’ graphics card.",
            "GALAX GeForce® GTX 1060 OC shines with innovative new gaming technologies, making it the perfect choice for the latest high-definition games and is VR Ready. Powered by NVIDIA Pascal™—the most advanced GPU architecture ever created—the GALAX GeForce® GTX 1060 OC delivers brilliant performance that opens the door to virtual reality and beyond. ",
            "The Galax GeForce GTX 1060 EX OC White 6GB graphics card offers an exciting alternative White color and our highest performance of all the 1060’s offered. The Galax 1060 EX OC White 6GB is super cooled by custom twin 90mm fans and is loaded with innovative new gaming technologies, making it the perfect choice for the latest high-definition games and is VR Ready. Powered by NVIDIA Pascal™—the most advanced GPU architecture ever created—the GeForce GTX 1060 delivers brilliant performance that opens the door to virtual reality and beyond. ",
            "The Galax GeForce GTX 1050 TI EXOC 4GB graphics card is designed for those gamers on a budget but need TI Power, more memory, and TI performance. The Galax GeForce GTX 1050 TI EXOC 4GB delivers significantly better speed and power efficiency than previous-generation cards. This 1050 TI has dual custom fans and an effective cooling design to keep the GPU cooler and cooler is better. "
    };

    private static int[] vgaPhotos = {
            R.drawable.aorus_gigabyte_rtx2080ti_extreme_waterforce,
            R.drawable.rog_strix_rtx2080ti_cod_bo4,
            R.drawable.rog_strix_rtx2080ti_gaming_oc,
            R.drawable.msi_rtx2080_gaming_x_trio,
            R.drawable.aorus_gigabyte_rtx2080_super8g,
            R.drawable.rog_strix_rtx2080_gaming_oc,
            R.drawable.zotac_rtx2080_super_twin,
            R.drawable.galax_gtx1660ti_oc_dual_fan,
            R.drawable.galax_gtx1060_oc,
            R.drawable.galax_gtx1060_exoc_white,
            R.drawable.galax_gtx1050ti_exoc
    };

    private static String[] vgaGraphicEngine = {
            "GeForce RTX™ 2080 Ti",
            "NVIDIA® GeForce RTX™ 2080 Ti",
            "NVIDIA® GeForce RTX™ 2080 Ti",
            "GeForce RTX™ 2080 GAMING X TRIO",
            "GeForce® RTX 2080 SUPER™",
            "NVIDIA® GeForce RTX™ 2080",
            "GeForce RTX 2080 SUPER",
            "GALAX GeForce® GTX 1660 Ti (1-Click OC)",
            "GALAX GeForce® GTX 1060 OC 6GB",
            "GALAX GeForce® GTX 1060 EXOC White 6GB",
            "GALAX GeForce® GTX 1050 Ti EXOC"
    };

    private static String[] videoMemory = {
            "11 GB",
            "GDDR6 11GB",
            "GDDR6 11GB",
            "8GB GDDR6",
            "8 GB",
            "GDDR6 8GB",
            "8GB GDDR6",
            "6 GB",
            "6 GB",
            "6 GB",
            "4 GB"
    };

    private static String[] cudaCore = {
            "4352 ",
            "4352 ",
            "4352 ",
            "2944",
            "3072",
            "2944",
            "3072",
            "1536",
            "1280",
            "1280",
            "768"
    };

    private static String[] coreClock = {
            "1770 MHz",
            "1665 MHz",
            "1665 MHz",
            "1860 MHz",
            "1860 MHz",
            "1890 MHz",
            "1815 MHz",
            "1800 MHz",
            "1733 MHz",
            "1771 MHz",
            "1468 MHz"
    };

    private static String[] memoryClock = {
            "14140 MHz",
            "14000 MHz",
            "14000 MHz",
            "14000 MHz",
            "15500 MHz",
            "14000 MHz",
            "15500 MHz",
            "12000 MHz",
            "12000 MHz",
            "12000 MHz",
            "11000 MHz"
    };

    private static String[] openGL = {
            "4.6",
            "OpenGL®4.5",
            "OpenGL®4.5",
            "4.5",
            "4.5",
            "OpenGL®4.6",
            "4.5",
            "OpenGL 4.6",
            "OpenGL 4.6",
            "OpenGL 4.6",
            "Open GL 4.5 Support"
    };

    private static String[] max_display = {
            "4",
            "4",
            "4",
            "4",
            "4",
            "4",
            "3",
            "3",
            "3",
            "3",
            "2"
    };

    private static String[] recom_psu = {
            "750W",
            "650W",
            "650W",
            "650W",
            "650W",
            "650W",
            "650W",
            "450W",
            "400W",
            "400W",
            "300W"
    };

    private static String[] power_conn = {
            "8 Pin*2",
            "2 x 8-pin",
            "2 x 8-pin",
            "8-pin x 2",
            "8 Pin*2",
            "2 x 8-pin",
            "6-pin 8-pin",
            "8-pin",
            "6-pin",
            "6-pin",
            "6-pin"
    };

    private static String[] sli_supp = {
            "2-way NVIDIA NVLINKTM",
            "YES",
            "YES",
            "NVIDIA® NVLink™ (SLI-Ready), 2-way ",
            "2-way NVIDIA NVLINK™",
            "YES",
            "NVLink (SLI-ready)",
            "-",
            "-",
            "-",
            "-"
    };

    static ArrayList<VGA> getListData() {
        ArrayList<VGA> list = new ArrayList<>();
        for (int position = 0; position < vgaNames.length; position++) {
            VGA vga = new VGA();
            vga.setName(vgaNames[position]);
            vga.setIntro(vgaIntro[position]);
            vga.setPhoto(vgaPhotos[position]);
            vga.setHarga(vgaHarga[position]);
            vga.setCore_clock(coreClock[position]);
            vga.setCuda_core(cudaCore[position]);
            vga.setVideo_memory(videoMemory[position]);
            vga.setGraphic_enging(vgaGraphicEngine[position]);
            vga.setMemory_clock(memoryClock[position]);
            vga.setOpenGL(openGL[position]);
            vga.setMax_display(max_display[position]);
            vga.setRecom_psu(recom_psu[position]);
            vga.setPower_connection(power_conn[position]);
            vga.setSli_support(sli_supp[position]);
            list.add(vga);
        }
        return list;
    }
}
