public class Program {  
    public static void main(String[] args) {
        String id = "012345678";
        String res = "";
        while (id.length() > 1) {
            int dl = id.charAt(0) - 48; // לוקח את המס הראשון 0
            int dr = id.charAt(id.length() - 1) - 48; // לוקח את המס האחרון 8 
            if (dl > dr)
                res = res + data[dl][dr];
            else
                res = data[dl][dr] + res; // פונה למקום הספציפי במערך 0 8
            id = id.substring(1, id.length() - 1); // מקטין את האורך של הסטריג מהסוף ומההתחלה
        }
        System.out.println(res);
    }

    public static String[][] data = {
            { "g", "vhwsdz1", "rpweq", "eymddqjk", "thptyhmk", "bxqxb", "n", "xlqyswqag", "koivkbbb", "esadlxpqd1" },
            { "jj", "lmqu", "b", "psyxtkfsz", "ufvnn", "nkfe", "nybu", "msbnmn", "iqjvqit", "yazhovhz" },
            { "a", "jm", "zflxlxhuuh", "jpijnafwl", "dthtw", "waedbzo", "flm", "reiuvynm", "zaoyjbjk", "ecmeyvxf" },
            { "yukjczb", "t", "gqnw", "vvly", "adonitq", "bsminmisv", "r", "fmajwxqkj", "kbasb", "xbgpu" },
            { "eawpsjio", "qgetrx", "gq", "ngvlgcyu", "e", "trei", "fegvndk", "wsrlz", "tfb", "fygitslrwy" },
            { "i", "jo", "jtpn", "djrgvj", "bhmzb", "pcag", "bc", "qsmbsupam", "dxbcipd", "qcq" },
            { "acnubtvct", "fvq", "tkxxqpyl", "nuzghnge", "wczcryjge", "fcykqaxvm", "xja", "ljj", "z", "tfbuobkdz" },
            { "mynusfce", "wlfpoqd", "zqucc", "tqqbtir", "ng", "b", "oxzgpropur", "twctpp", "qnjl", "qtmkcv" },
            { "iqopm", "oyeuwwrt", "fhb", "ccnamhzowi", "nfsqlnf", "rqbtprk", "tmiptlg", "cin", "jtfkscce", "hsvtslccmy" },
            { "uqcqc", "wwomeklbr", "dhxxnkek1", "tyg", "icbzgrpvc", "b", "hejdh", "tsgemuno", "kfmcf", "n" }
    };
}
