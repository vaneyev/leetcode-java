package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution387Test {

    @Test
    void firstUniqChar1() {
        int output = new Solution387().firstUniqChar("leetcode");
        assertEquals(0, output);
    }

    @Test
    void firstUniqChar2() {
        int output = new Solution387().firstUniqChar("loveleetcode");
        assertEquals(2, output);
    }

    @Test
    void firstUniqChar3() {
        int output = new Solution387().firstUniqChar("aabb");
        assertEquals(-1, output);
    }

    @Test
    void firstUniqChar4() {
        int output = new Solution387().firstUniqChar("mmestrsbrlktgkorlcnihdfwopqcgwsmehcvhahqlpvakkxmfuprbrehquexugctesjgaxcvhoswemaamknuddvlaoniwvopunbfxhdsgocngkqwxuakptxsogwnktnauabdsibwgivlhciwgrisehtfkuvxrahhmssxsbejamccwvhwbduekibduisfttvdmntsxuouebcbflwaqifrroinnjoirvpnuxfkcheglbmbtmntlrkijiajlijyjgudebqrbdjpdcbbaxtpkgujkatriwkbvwvqelthwitiovbbevanwpkemuovsakjlfbjuuocqfkqcktbhonendvkxfetlbaunljqnwteguxhbipksscvieustdknrifesxvuvxhectkwrbotdbooiiqeiwdtgmaackmvgafdltcmmdavtdkrdarjxfflbgcbfupuwjdqjmqbrhugdhogtuwawsqhswdwsnvahkblmolwinlqjgrdxdacgtvwrekplmobhcanmjecrvntpadcohwnibujgiaexdmiakqejmtfmgqftfvccobddtmpbrewhqvtjdatdqhpjbpqxvpecjadwloicaxubmjfcsqxkvqjapqerhahoimwtxkmrnqxgpjtdssswdxsjgepdejdwdfdjboeoiigwbnxukdtxbuluoktuurqcrkkppvpbjgjkruifjosobgssbdhupjpsluehbvnthmiqigpoqjajrojbvgulvbxojcaqjxxcehmrwvkhxemcsliktubrnijolfosnkexzjeodwmigawhegfgtmoorousbmonhomtwkiwxmkknfpsxxcevxdkpualdarkfvqvdbjqbnodtcgcsvptjvbnqkfxiiwxifhmhpvwdjhubqdgojsnovxpmpuirvgvhwjkqepxdrvoaopatsfjoivrsmumgphmmbxwxxudsvjpfnqxjbpgxnurtjvfhflvvnaqmiorqmcbdurdqfbwcnljieibdasoluepximluxadrehmihsaohkxhiukepcjoldvqxhqqvduwvucigkmneknqdbxatfeomwboewjkxmotopfjtjknmkrvopiidtjdxumlirudmtqiqbvlgqsposvmixmuishmmgmncqcdngcvcqcoggndcdihkanmcevcklsmtudjkpervgvkmmbbkuculdcxiinfrlgsleqxcnwoqdeopqhrlfkumplolpgnkwbojqplwrisufidaupkihsguujbkai");
        assertEquals(251, output);
    }

    @Test
    void firstUniqChar5() {
        int output = new Solution387().firstUniqChar("acaadcad");
        assertEquals(-1, output);
    }
}