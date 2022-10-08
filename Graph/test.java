import java.util.*;

public class test {

    public static void dfs(int src, ArrayList<ArrayList<Integer>> al) {
		int vertex= al.size();
		
		boolean vis[]=new boolean[vertex];
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(src);
		
		while(!stack.isEmpty()) {
			int curr= stack.pop();
			
			if(!vis[curr]) {
				System.out.print(curr +" ");
				vis[curr]=true;
			}
			
			for(int neigh: al.get(curr)) {
				if(!vis[neigh]) {
					stack.push(neigh);
				}
			}
		}
	}

    public static void bfs(int src, ArrayList<ArrayList<Integer>> al) {
        Queue<Integer> queue=new LinkedList<>();
        int vertex=al.size();
        boolean vis[]=new boolean[vertex];

        queue.add(src);
        vis[src]=true;
        System.out.println(src);
        while(!queue.isEmpty()) {
            int curr=queue.poll();
                    
            for(int neigh: al.get(curr)) {
                if(!vis[neigh]) {
                    System.out.print(neigh+ " ");
                     vis[neigh]=true;
                    queue.add(neigh);
                }
            }
            System.out.println();
        }                     
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int vertex = sc.nextInt();

		int edge = sc.nextInt();

		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= vertex; i++) {
			al.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < edge; i++) {
			int from = sc.nextInt(), to = sc.nextInt();
			al.get(from).add(to);
			al.get(to).add(from);
		}
		
		for(int i=0;i<=vertex;i++) {
			System.out.println(al.get(i));
		}

	}
}
