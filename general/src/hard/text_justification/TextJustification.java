package hard.text_justification;

import java.util.ArrayList;
import java.util.List;

/**
 * LC# 68
 *
 * Reference: https://leetcode.com/problems/text-justification/solutions/2202707/readable-java-solution-with-comments-beats-100/
 *
 * T(n)=O(lines * maxwidth)
 * S(n)=O(lines * maxwidth)
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int length = words.length;
        List<String> outputList = new ArrayList<>();
        for (int startIndex = 0; startIndex < length;) {
            int wordCount = findLineFitCount(words, startIndex, maxWidth);
            String formattedStr = arrangeWords(words, startIndex, wordCount, maxWidth);

            outputList.add(formattedStr);
            startIndex += wordCount;
        }

        return outputList;
    }
    private int findLineFitCount(String[] words, int startIndex, int maxWidth) {
        int count = 0;
        int wordCount = 0;
        for (int i = startIndex; i < words.length; i++) {
            if (i != startIndex) {
                count++;
            }

            count += words[i].length();
            if (count <= maxWidth) {
                wordCount++;
            } else {
                break;
            }
        }

        return wordCount;
    }

    private String arrangeWords(String[] words, int startIndex, int wordCount, int maxWidth) {
        StringBuilder formattedStr = new StringBuilder();
        if (startIndex + wordCount < words.length) {
            formattedStr.append(arrangeWordsPriorLastOne(words, startIndex, wordCount, maxWidth));
        } else {
            formattedStr.append(arrangeWordsInLastLine(words, startIndex, wordCount));
        }

        formattedStr.append(" ".repeat(maxWidth - formattedStr.length()));

        return formattedStr.toString();
    }

    private String arrangeWordsPriorLastOne(String[] words, int startIndex, int wordCount, int maxWidth) {
        // word arrangement is different for last line vs the other lines
        int wordLength = 0;
        for (int i=startIndex; i < (startIndex+wordCount); i++) {
            wordLength += words[i].length();
        }

        int totalSpacesToFillIn = maxWidth - wordLength;
        boolean hasMultipleWords = wordCount > 1;
        int equalSpaceToDistribute =  hasMultipleWords ? (totalSpacesToFillIn / (wordCount - 1)) : 0;
        int extraSpaceToDistribute = hasMultipleWords ? (totalSpacesToFillIn % (wordCount - 1)) : 0;

        StringBuilder sb = new StringBuilder();
        for (int i= startIndex; i < startIndex+wordCount; i++) {
            if (i != startIndex) {
                for (int j = 0; j < equalSpaceToDistribute; j++) {
                    sb.append(" ");
                }

                if (extraSpaceToDistribute > 0) {
                    sb.append(" ");
                    extraSpaceToDistribute--;
                }
            }

            sb.append(words[i]);
        }

        return sb.toString();
    }

    private String arrangeWordsInLastLine(String[] words, int startIndex, int wordCount) {
        StringBuilder sb = new StringBuilder();
        for (int i= startIndex; i < startIndex+wordCount; i++) {
            if (i != startIndex) {
                sb.append(" ");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }
}
