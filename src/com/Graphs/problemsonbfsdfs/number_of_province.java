package com.Graphs.problemsonbfsdfs;
/*There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c,
 then city a is connected indirectly with city c.
A province is a group of directly or indirectly connected cities and no other cities outside of the group.
You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected,
and isConnected[i][j] = 0 otherwise.
Return the total number of provinces.

Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2

// bfs or dfs can be used
O(N) + O(V+2E), Where O(N) is for outer loop and inner loop runs in total a single DFS over entire graph,
and we know DFS takes a time of O(V+2E).

Space Complexity: O(N) + O(N),Space for recursion stack space and visited array.
*/
public class number_of_province {
        public static void dfs(int[][] isConnected, int currvertex, boolean[] vis){
            vis[currvertex]=true;
            for(int i=0; i<isConnected.length;i++){
                if(isConnected[currvertex][i]==1 & vis[i]==false){         // if i is the neighbour of currvertex
                    dfs(isConnected,i,vis);
                }
            }
        }

        public static int findCircleNum(int[][] isConnected) {
            int n =isConnected.length;
            boolean[] vis=new boolean[n];
            int count=0;
            for(int i=0; i < n ;i++){
                if(vis[i]==false){                                         // if not visited do dfs
                    dfs(isConnected,i,vis);
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
            int[][] arr={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(arr));
    }

    }
