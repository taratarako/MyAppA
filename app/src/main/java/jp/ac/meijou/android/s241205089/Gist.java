package jp.ac.meijou.android.s241205089;

import java.util.Map;

/**
 * GistのJSONレスポンス
 */
public class Gist {
    public Map<String, GistFile> files;

    public static class GistFile {
        public String content;
    }
}