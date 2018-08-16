package com.github.jhpoelen.fbob;

/**
 * Accepts value candidates and provides a way to select value from those accepted.
 */

public interface ValueSelector {
    void accept(String value);
    String select();
}
