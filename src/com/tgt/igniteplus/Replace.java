package com.tgt.igniteplus;

public class Replace {
    public static void main(String[] args) {
        String str = "I am always ready to learn although I do not always like being taught.";
        String rep = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                rep = str.replace('a', '$');
        }
        System.out.println("New string:\t" + rep);
    }
}
/*
New string:	I $m $lw$ys re$dy to le$rn $lthough I do not $lw$ys like being t$ught.
 */