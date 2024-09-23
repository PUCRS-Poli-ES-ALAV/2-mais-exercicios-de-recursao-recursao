public class FindSubStr {
    public static boolean call(String str, String match) {
        boolean found = true;

        if (str == null || match == null) throw new NullPointerException();
        if (str.length() < match.length()) return false;
        if (match.length() == 0) return true;
        if (str.length() == 0) return false;

        if (str.charAt(0) != match.charAt(0)) {
            found = call(str.substring(1), match);
        } else {
			if (prefix(str, match) == true)
				found = true;
			else
				found = call(str.substring(1), match);
		}
		return found;
    }

    private static boolean prefix(String str, String match){
		boolean res = true;

		if (str == null || match == null)
			throw new IllegalArgumentException();

		if (str.length() < match.length())
			res = false;
		else if (match.length() ==0)
			res = true;
		else if (str.length() ==0)
			res = false;
		else if (str.charAt(0) == match.charAt(0))
			res = prefix(str.substring(1), match.substring(1));
		else
			res = false;

		return res;
	}
}
