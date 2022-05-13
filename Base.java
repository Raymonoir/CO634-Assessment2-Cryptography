import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class Base {

    // Top 100 common english words
    public static String[] commonWords = {
            "a",
            "about",
            "all",
            "also",
            "and",
            "as",
            "at",
            "be",
            "because",
            "but",
            "by",
            "can",
            "come",
            "could",
            "day",
            "do",
            "even",
            "find",
            "first",
            "for",
            "from",
            "get",
            "give",
            "go",
            "have",
            "he",
            "her",
            "here",
            "him",
            "his",
            "how",
            "I",
            "if",
            "in",
            "into",
            "it",
            "its",
            "just",
            "know",
            "like",
            "look",
            "make",
            "man",
            "many",
            "me",
            "more",
            "my",
            "new",
            "no",
            "not",
            "now",
            "of",
            "on",
            "one",
            "only",
            "or",
            "other",
            "our",
            "out",
            "people",
            "say",
            "see",
            "she",
            "so",
            "some",
            "take",
            "tell",
            "than",
            "that",
            "the",
            "their",
            "them",
            "then",
            "there",
            "these",
            "they",
            "thing",
            "think",
            "this",
            "those",
            "time",
            "to",
            "two",
            "up",
            "use",
            "very",
            "want",
            "way",
            "we",
            "well",
            "what",
            "when",
            "which",
            "who",
            "will",
            "with",
            "would",
            "year",
            "you",
            "your" };

    public static void main(String[] args) {

        // Exercise 1
        // caesarDecipher(
        // "SDULVKWKHERQHVRIKHUDQFHVWRUVKHUXVHOHVVDQFHVWRUVODBHQWRPEHGVKHKDGQRDGPLUDWLRQIRUWKHPQRZVKHDOPRVWKDWHGWKHPIRUWKHGDQFHWKHBKDGOHGKHUQRWDWKLQJRIDOOWKDWKDGEHHQWKHLUVGLGVKHUHWDLQEXWWKHROGVHDODQGVSRRQSRRKLKDYHDVPXFKRIPRWKHUDVIDWKHULQPHVKHVDLGDOOPBSUHWWLQHVVFRPHVIURPKHUDQGVKHZDVRQOBDGDLUBPDLGWKHMRXUQHBRYHUWKHLQWHUYHQLQJXSODQGVDQGORZODQGVRIHJGRQZKHQVKHUHDFKHGWKHPZDVDPRUHWURXEOHVRPHZDONWKDQVKHKDGDQWLFLSDWHGWKHGLVWDQFHEHLQJDFWXDOOBEXWDIHZPLOHVLWZDVWZRKRXUVRZLQJWRVXQGUBZURQJWXUQLQJVHUHVKHIRXQGKHUVHOIRQDVXPPLWFRPPDQGLQJWKHORQJVRXJKWIRUYDOHWKHYDOOHBRIWKHJUHDWGDLULHVWKHYDOOHBLQZKLFKPLONDQGEXWWHUJUHZWRUDQNQHVVDQGZHUHSURGXFHGPRUHSURIXVHOBLIOHVVGHOLFDWHOBWKDQDWKHUKRPHWKHYHUGDQWSODLQVRZHOOZDWHUHGEBWKHULYHUYDURUIURRPLWZDVLQWULQVLFDOOBGLIIHUHQWIURPWKHYDOHRIOLWWOHGDLULHVEODFNPRRUYDOHZKLFKVDYHGXULQJKHUGLVDVWURXVVRMRXUQDWWUDQWULGJHVKHKDGHAFOXVLYHOBNQRZQ",
        // commonWords);

        // Exercise 2
        // System.out.println(vigenereCipher("VIKHWUXKMQISFHZZVECIKISFKSFFLR",
        // "TESSOFTHEDURBERVILLES"));

        // Exercise 3
        // key = "QZFTXM"
        // vigenereCipher6(
        // "HDRBKPUCFGDQBSMTQTUVFLPACDBAXFKMKTFDBXYTHUDFFWSMDSFZBAVZSTZOYCJGQMBOTLFFYNSTKPXDBXKFDNKNOFXDWPFFXHYGLPUENGFFUVTKAEEEQHSQXZIVOAIRJWQTUHWEFBIZXRBFQMILREFDSLFADZYMEUIOTBKFMZXWBEYQFUIQDNBALIUUJKEQMZQDBPIKTPIKJNRTHQJGJKBYQHSWBDEEYABPYRYTKOUZXELZWZXILEIHGEBNKSFMIMISYABKSZRXQAJGJUBZTZSWQTUQJLQAVSMXFDFQTZOQIRBTPUDEZEIHYDBHCFXDTMEQHSMKBQJGJWOKBZSWTMIQJTZTUCFGATURJMEQHCTPKTUQKKFQDCXPBDUKTHHUDFBBQTHNZGAFXNZZEFVTQXVQIZYABDQMIAFYQMILEQSNZEAEUDYAXFJGJREMTAJXKFQKPBKSEEMXOTUGFLQUBXGTAQJGJFCMHDBXIXQMILMXQRMXANQBPTIADFYABEJQJMZTEEXNYYUQLXADEZIMEQVNZKJALDIHKFEFJMEQHZXUBREQJMFXBLFKFMDAWHHQJGJLFXUMHXYKIZDBKSDNNGXXBSWNQTMDMTSQDNHAXZSDFZXUDRYABDIGJELAADICLKBDXLIKQSYXPEMGFMAAONZFBMDZXDBPJGJEXFJDWABXYJJLBQRDXMQTUUJKVNURYPBOETQWPQUHYTPTUAWHRSXSJXEQMNZEATQUJDFEIDIXBUVXTNEMTDSVLGHZLXATYLYHAAYSJOBDINQBQFBDSHKAIZNWPTUSMXDMYDYRTUJGBAFOXSMXVTQCXXQAKSMTAEELJALI",
        // commonWords);

        // System.out.println(vigenereCipher(
        // "HDRBKPUCFGDQBSMTQTUVFLPACDBAXFKMKTFDBXYTHUDFFWSMDSFZBAVZSTZOYCJGQMBOTLFFYNSTKPXDBXKFDNKNOFXDWPFFXHYGLPUENGFFUVTKAEEEQHSQXZIVOAIRJWQTUHWEFBIZXRBFQMILREFDSLFADZYMEUIOTBKFMZXWBEYQFUIQDNBALIUUJKEQMZQDBPIKTPIKJNRTHQJGJKBYQHSWBDEEYABPYRYTKOUZXELZWZXILEIHGEBNKSFMIMISYABKSZRXQAJGJUBZTZSWQTUQJLQAVSMXFDFQTZOQIRBTPUDEZEIHYDBHCFXDTMEQHSMKBQJGJWOKBZSWTMIQJTZTUCFGATURJMEQHCTPKTUQKKFQDCXPBDUKTHHUDFBBQTHNZGAFXNZZEFVTQXVQIZYABDQMIAFYQMILEQSNZEAEUDYAXFJGJREMTAJXKFQKPBKSEEMXOTUGFLQUBXGTAQJGJFCMHDBXIXQMILMXQRMXANQBPTIADFYABEJQJMZTEEXNYYUQLXADEZIMEQVNZKJALDIHKFEFJMEQHZXUBREQJMFXBLFKFMDAWHHQJGJLFXUMHXYKIZDBKSDNNGXXBSWNQTMDMTSQDNHAXZSDFZXUDRYABDIGJELAADICLKBDXLIKQSYXPEMGFMAAONZFBMDZXDBPJGJEXFJDWABXYJJLBQRDXMQTUUJKVNURYPBOETQWPQUHYTPTUAWHRSXSJXEQMNZEATQUJDFEIDIXBUVXTNEMTDSVLGHZLXATYLYHAAYSJOBDINQBQFBDSHKAIZNWPTUSMXDMYDYRTUJGBAFOXSMXVTQCXXQAKSMTAEELJALI",
        // "QZFTXM"));

        // Exercise 4
        // key = MDWQCX
        // vigenereCipher4To6(
        // "YKAHDXENAJCKPLPWNFEWADGAXLGUCPXLIOUKMNAYPQTHYENAEWEBNOMBOEHQTHIEQKFLOJTBMFHUUXUGWDQYEHNLCKFPWJTLZWNUCZXHEJYXEFWHUMARNENASUWDFJAWDUTEMGWMGXWQAIUCAUPXGPIHAJUQGIBXQKQBOXGEMGEDRIQQPOQRFRBXGOAZJXKSQVXKVQDHWSNBIDOMJXFKAHULGOZUUFDHZQPAODNXCANHADCYAXPJQDUYAXGOMWNUCQAIOKTMDLOUJXEWEBAIAZAHKKSWDUDXENAJVEQGWHMDUUHVQRZGPXCQFKALGPEHHSQKFDEDKKSWDUUVDXLXCANHADUJMVDUFTUWDYPYKWDYUQUPAJJBDHDQFXDLOUPXEKKKVLROWKIEFHNQVQTHANVOMRNTKKMUUQRMQDNQPZQRBSCOEEWSMTTLYXKODLPQVBPWDUFXDNMKGBZLJJQDQWPYPDDLZEHQTHZYUCUJQHGJQQPRAQTHBYTPFVQTFBZPAQPPMYWYNXNOAQPAUQZURBZGADVIKRBJJBTHHFQCFKAIELRIAHUPTHNKUEQGANEFFHZBAFZWKJJBRLABFQTHUMGOQDXEWQFRYHQPEDJTHIUQCYPDTHNIGIRIHQVLZKAHDXONQFQKFKAWTXEVXUIXZWKMKMQKAHILIQWIYBXOWIUEQFKKNANBOFKKZLJWJLDLVEPQMOHOQKFKAXGONDCUCKPGNQIDUQCXGOEHHVQSQUEJWMAQDUTBXEKMUQTHHQWDTWAHTXZJHEWAQUPXGVOOQDIQAWDUIXFHPEVEQSKIVPDHOJGAAQPXGFDVPQXBELJJJBIHWAPB",
        // commonWords);

        // System.out.println(vigenereCipher(
        // "YKAHDXENAJCKPLPWNFEWADGAXLGUCPXLIOUKMNAYPQTHYENAEWEBNOMBOEHQTHIEQKFLOJTBMFHUUXUGWDQYEHNLCKFPWJTLZWNUCZXHEJYXEFWHUMARNENASUWDFJAWDUTEMGWMGXWQAIUCAUPXGPIHAJUQGIBXQKQBOXGEMGEDRIQQPOQRFRBXGOAZJXKSQVXKVQDHWSNBIDOMJXFKAHULGOZUUFDHZQPAODNXCANHADCYAXPJQDUYAXGOMWNUCQAIOKTMDLOUJXEWEBAIAZAHKKSWDUDXENAJVEQGWHMDUUHVQRZGPXCQFKALGPEHHSQKFDEDKKSWDUUVDXLXCANHADUJMVDUFTUWDYPYKWDYUQUPAJJBDHDQFXDLOUPXEKKKVLROWKIEFHNQVQTHANVOMRNTKKMUUQRMQDNQPZQRBSCOEEWSMTTLYXKODLPQVBPWDUFXDNMKGBZLJJQDQWPYPDDLZEHQTHZYUCUJQHGJQQPRAQTHBYTPFVQTFBZPAQPPMYWYNXNOAQPAUQZURBZGADVIKRBJJBTHHFQCFKAIELRIAHUPTHNKUEQGANEFFHZBAFZWKJJBRLABFQTHUMGOQDXEWQFRYHQPEDJTHIUQCYPDTHNIGIRIHQVLZKAHDXONQFQKFKAWTXEVXUIXZWKMKMQKAHILIQWIYBXOWIUEQFKKNANBOFKKZLJWJLDLVEPQMOHOQKFKAXGONDCUCKPGNQIDUQCXGOEHHVQSQUEJWMAQDUTBXEKMUQTHHQWDTWAHTXZJHEWAQUPXGVOOQDIQAWDUIXFHPEVEQSKIVPDHOJGAAQPXGFDVPQXBELJJJBIHWAPB",
        // "MDWQCX"));

        // Exercise 5
        // rows = 4
        // transpositionDecipher1(
        // "FLBNGUDNWRBDMMOLSTOAPNHDHRRRFDANRGRWENWBEWANMJDEEAAOEETNTLETAOARHTOBEMEUUSANWTELIYMRHMFUSTGHEENEETEFYHDNPATTENHSCSUOORMPHORFDRRKHUSIIOHAFEHAHUENOLEMSONLUNIUYANENOMERSIIOAGHEKENHEFSSNDJSOBDEENNMEGSHTAFSSAWSRTTPFTAEJIPDTADBFTANBAHNLETEOESSBIRRGDHTHENHUNIYGIOUYLSSNLRUOTODOCOLOEERUSORGPNTIEHSLNBEOEAEROHOESSDNPTSHOREGRBHHRAAWHSLAFEAAETSTTEENTNTCLCEDOMEIEGRTRTOYTCDPWGTGODIDGHORESLLRVTOWTRGADOFOGEOEMRERRAYELBLTHCTSINHTIIILOANGINAOHTRLRHTSONEGLDOEFVEDEEEDHATHIVOERETOFLARFDASAOONDYAIBKREMORLTSTCHIOINEETFTEDMWNAEMIFFHSETRISEUERIOLAESLRHTCDSWIIRRHGAHFUILHOALKCLRORDDHGLIAFBFKHYRUHHUFSLAETBTNLLLIHUOOSLNEROLIEALUADTETTFIUILEKEASCIHNNVARLDAGGNWEEIEOEREWDSGOOTNTEMUYLGIEUEELEWNDDHUAYNBIWPITVFEIFTNLMVFTUWDTSHATTTOAKRIALAFTOSTSENTRNAVHENORTNITBETPOCMIEOBTENNTMEINEONGYIRLRTREETSTATEYLKFERAEOIPOTHIHOGRHOEOWFENESRHIEDFTRONDNDPIHHOAIENTGYLOSSTELESCENR",
        // commonWords);

        // Exercise 6
        // ORDER = 4, 1, 2, 0, 5
        // transpositionDecipher2(
        // "WEHAEWNUTDOFIOPGEEPHLNRNSIHTHOSIOGCHHPMSTERDNRLLSELMDEHURTYINENOBAEDSEOIPOOTTDTCDSAAIOCSEALSDHPSAETOFRSDCUAHTEFTPIFEYUOSNOTEAPEUIODEYBSWAOMEUWORIDSVHYPSNSETSATIODDETVOILSNDSHARETYNDNNSTERSHLDGFEUOELEIFEUOSALHDEDHBLNENSIPITNADOITOUCROIDHRSDNATGSRNEFCBRRIIBMYTINMOYRLSRANITUOTHAAEWHSIUAAIOIAMATOGDHSNHNUVFRHIFGLTISSEIEAEOYETTOHDVWALAWILRNSLDSLRPBLTOAWLFEYAGAOUNRNHERRMNRTGHAUCAETHOTNHEAEGROAIENSSLIDHTOSNMSEHDBONAUSAATHNIOAYNORNSBTEUEOHPNAPFACAEHOANNIYIIIESAHNEALAEERHEEWAONYHFRTARHEHFNGHCTNHETDLIHOEREDYOWDCTNTODGRHDDIDIAORNETIHDSEEAHTIRBLHSEWMEPAEESHIOTTTHSHOTAEFRAAOSHERMTUORXOLEECTTPOETEDMTNELEELEOHCIETBLLHDIASRETEITMGLANTYAASRMNIWTIHUHEATSNNROTRNLAWAEKNSWGUAHSHTNIWHETOSOSAGEEOFHOSHRTTFYDAOTATNAHEDGCGTOOTAFOLRUEYSETPAUIILTHTOTTTNDTTMUERHULAUIETWRENTTBSYBTUSOLALSNATRWARTCFNGEGEWMYFGAHHISNHMRSONTYELITOHRNDIOSVELAODTOEOPWEHOWKNSALYIESAM",
        // commonWords);

        // Exercise 7
        // substitutionCipher(
        // "DSDEVDVSRPQWSQWDSWDTLMSTEVSZAN|BDSUN|BNPQBSRWPZWSBWDSHPCDVSHDTBQSRA|CSAEST|TJHDSHTEVSRA|CSAYSBNZWS|ANGWEDBBSPEVDDVSTBSBWDSRANHVSEDLD|SWTLDSVDHPJD|TQDHMSLAHNQDD|DVSYA|SQART|VBSQWDSBDZAEVSDLDEPEGSBWDS|DTZWDVSQWDSP||DGNHT|SZWTHCSQTJHDSHTEVSA|SUHTQDTNSJABAODVSRPQWSBDOPSGHAJNHT|SQNONHPSTBSPYSZMJDHDSQWDSOTEMSJ|DTBQDVSRD|DSBNUPEDHMSDXQDEVDVSQWD|DSRWPZWSBQ|DQZWDVSJDQRDDESQWDSLTHHDMSAYSWD|SJP|QWSTEVSQWDSLTHHDMSAYSWD|SHALDSWD|DSQWDSTP|SRTBSV|MSTEVSZAHVSTEVSQWDSHAEGSZT|QS|ATVBSRD|DSJHARESRWPQDSTEVSVNBQMSRPQWPESTSYDRSWAN|BSTYQD|S|TPESQWD|DSRD|DSYDRSQ|DDBSA|SEAEDSQWABDSQWTQSRANHVSWTLDSG|ARESPESQWDSWDVGDBSJDPEGSOD|ZPHDBBHMSUHTBWDVSVARESRPQWSQWDSKNPZCBDQSJMSQWDSQDETEQSYT|OD|BSQWDSETQN|THSDEDOPDBSAYSQ|DDSJNBWSTEVSJ|TCDSPESQWDSOPVVHDSVPBQTEZDSTWDTVSAYSWD|SBWDSZANHVSBDDSQWDSBNOOPQBSAYSJNHJT||ARSTEVSAYSEDQQHDZAOJDSQANQSTEVSQWDMSBDDODVSY|PDEVHMSQWD",
        // plain("tess27.txt"), commonWords);
    }

    public static void substitutionCipher(String cipherText, String plainText, String[] commonWords) {
        // A...Z |
        // Frequencies of plain text
        int[] plainFreq = new int[27];
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) == '|') {
                plainFreq[26]++;
            } else {
                int val = (plainText.charAt(i) - 65) % 26;
                plainFreq[val]++;

            }
        }

        // Frequencies of cipher text
        int[] cipherFreq = new int[27];
        for (int i = 0; i < cipherText.length(); i++) {
            if (cipherText.charAt(i) == '|') {
                cipherFreq[26]++;
            } else {
                int val = (cipherText.charAt(i) - 65) % 26;
                cipherFreq[val]++;
            }
        }

        // Output plain freqs
        for (int i = 0; i < 26; i++) {
            System.out.print(String.format("|%-5s", (char) (65 + i)));
        }
        System.out.println();
        for (int i = 0; i < 27; i++) {
            System.out.print(String.format("|%-5s", plainFreq[i]));
        }

        System.out.println();

        // Output cipher freqs
        for (int i = 0; i < 26; i++) {
            System.out.print(String.format("|%-5s", (char) (65 + i)));
        }
        System.out.println();
        for (int i = 0; i < 27; i++) {
            System.out.print(String.format("|%-5s", cipherFreq[i]));
        }

        String cipherSwap = "SDQWT|VBAHPNRJZYMOLGCUKEX";
        String plainSwap = "|ETHARDSOLIUWBCFYMVGKPQNX";

        String prodPlain = swap(cipherText, cipherSwap, plainSwap);

        System.out.println();
        System.out.println(prodPlain);
        System.out.println();

        System.out.println(countMatches(commonWords, prodPlain));
    }

    // Swap any char in cipherChars found in cipherText with PlainChars
    public static String swap(String cipherText, String cipherChars, String plainChars) {
        char[] arr = new char[cipherText.length()];
        for (int i = 0; i < cipherText.length(); i++) {
            if (cipherChars.contains(String.valueOf(cipherText.charAt(i)))) {
                int index = cipherChars.indexOf(String.valueOf(cipherText.charAt(i)));
                arr[i] = plainChars.charAt(index);
            } else {
                arr[i] = '_';
            }
        }

        return new String(arr);
    }

    public static void transpositionDecipher2(String cipherText, String[] comWords) {

        String[] array = new String[cipherText.length() / 6];
        int mod = cipherText.length() / 6;

        for (int i = 0; i < array.length; i++) {
            array[i] = "";
        }

        for (int i = 0; i < cipherText.length(); i++) {
            array[i % mod] += String.valueOf(cipherText.charAt(i));
        }

        ArrayList<Integer> pos = new ArrayList<Integer>();
        pos.add(0);
        pos.add(1);
        pos.add(2);
        pos.add(3);
        pos.add(4);
        pos.add(5);

        boolean solved = false;

        int count = 0;
        while (!solved) {
            String plainText = "";
            Collections.shuffle(pos);

            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < 6; i++) {
                    plainText += array[j].charAt(pos.get(i));
                }
            }

            int newCount = countMatches(comWords, plainText);
            if (newCount > count) {

                count = newCount;

                System.out.println(plainText);

                for (int i = 0; i < 6; i++) {
                    System.out.print(pos.get(i) + " ");
                }
                System.out.println(count);
                System.out.println();
            }
        }
    }

    public static void transpositionDecipher1(String cipherText, String[] comWords) {

        int count = 0;

        for (int rowLength = 4; rowLength < 7; rowLength++) {

            // Later realised you do not need the mod as 840 % 4,5,6 == 0
            String[] plainTextArr = new String[cipherText.length() / rowLength];
            int mod = cipherText.length() / rowLength;

            for (int i = 0; i < plainTextArr.length; i++) {
                plainTextArr[i] = "";
            }

            for (int i = 0; i < cipherText.length(); i++) {
                plainTextArr[i % mod] += String.valueOf(cipherText.charAt(i));
            }

            String prodPlainText = "";
            for (int i = 0; i < plainTextArr.length; i++) {
                prodPlainText += plainTextArr[i];
            }

            int newCount = countMatches(comWords, prodPlainText);

            if (newCount > count) {
                count = newCount;
                System.out.println(prodPlainText);
                System.out.println(newCount);
                System.out.println(rowLength);
                System.out.println();
            }

        }

    }

    // A = 65, Z = 90
    public static void caesarDecipher(String cipherText, String[] comWords) {

        int matches = 0;
        String plainText = "";

        for (int i = 0; i < 26; i++) {
            // SHIFT CHARACTERS BY I
            char[] charArray = cipherText.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                int val = 65 + ((charArray[j] + i - 65) % 26);

                charArray[j] = (char) (val);
            }

            int count = countMatches(comWords, new String(charArray));
            if (count > matches) {
                plainText = new String(charArray);
                matches = count;
            }
        }

        System.out.println(plainText);
        System.out.println(matches);
    }

    public static String vigenereCipher(String cipherText, String key) {

        char[] array = new char[cipherText.length()];
        for (int i = 0; i < cipherText.length(); i++) {

            int val = 65 + (cipherText.charAt(i) - 65) - (key.charAt(i % key.length()) - 65);

            if (val < 65) {
                val = 91 - (65 - val);
            }
            array[i] = (char) val;
        }

        return new String(array);
    }

    public static String randomLetters(int length) {
        Random r = new Random();
        char[] arr = new char[length];

        for (int i = 0; i < length; i++) {
            arr[i] = (char) (65 + r.nextInt(26));
        }
        return new String(arr);
    }

    public static void vigenereCipher6(String cipherText, String[] comWords) {
        boolean solved = false;
        String key = "";
        int maxSoFar = 0;
        while (!solved) {
            key = randomLetters(6);

            int count = countMatches(commonWords, vigenereCipher(cipherText, key));

            if (count > maxSoFar) {
                System.out.println(count + " " + key);
                maxSoFar = count;
            }
            if (count > 50) {
                solved = true;
            }

        }
        System.out.println(countMatches(comWords, vigenereCipher(cipherText, key)));
        System.out.println(key);
        System.out.println(vigenereCipher(cipherText, key));
    }

    // Same as above but searching a bit longer
    public static void vigenereCipher4To6(String cipherText, String[] wordsCom) {
        boolean solved = false;
        String key = "";
        int maxSoFar = 0;

        while (!solved) {
            Random r = new Random();
            int val = 4 + r.nextInt(3);

            key = randomLetters(val);

            int count = countMatches(wordsCom, vigenereCipher(cipherText, key));

            if (count > maxSoFar) {
                System.out.println(count + " " + key);
                maxSoFar = count;
            }
        }

        System.out.println(vigenereCipher(cipherText, key));
        System.out.println(countMatches(wordsCom, vigenereCipher(cipherText, key)));
        System.out.println(key);
    }

    public static int countMatches(String[] arrayValues, String text) {
        int count = 0;
        for (int i = 0; i < arrayValues.length; i++) {
            if (text.contains(arrayValues[i].toUpperCase())) {
                count++;
            }
        }
        return count;

    }

    public static String plain(String fileName) {
        String plain = "";
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                plain += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return plain;
    }
}