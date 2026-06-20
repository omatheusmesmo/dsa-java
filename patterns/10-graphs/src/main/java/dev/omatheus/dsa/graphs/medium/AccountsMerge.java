package dev.omatheus.dsa.graphs.medium;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/accounts-merge/">721. Accounts Merge</a> (Medium)
 *
 * <p>Given a list of accounts where each element accounts[i] is a list of strings, where the
 * first element accounts[i][0] is a name, and the rest of the elements are emails representing
 * emails of the account. Merge accounts that share common emails, return the accounts in the
 * following format: the first element of each account is the name, and the rest of the elements
 * are emails in sorted order.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 * Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= accounts.length <= 1000</li>
 *   <li>2 <= accounts[i].length <= 10</li>
 *   <li>1 <= accounts[i][j].length <= 30</li>
 * </ul>
 *
 * @see AccountsMergeTest
 */
public class AccountsMerge {

    /**
     * Merges accounts that share common emails.
     *
     * @param accounts list of accounts
     * @return list of merged accounts
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
