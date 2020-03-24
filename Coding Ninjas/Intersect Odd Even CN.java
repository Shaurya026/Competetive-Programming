import java.util.Scanner;

class ListNode<t> {
	public t data;
	public ListNode<t> next;
	public ListNode(t data)
	{
		this.data=data;
	}
}

class runner {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ListNode<Integer> head1 = null, temp = null;
		//enter -1 to end
		int data = s.nextInt();
		while(data != -1){
			if(head1 == null){
				head1 = new ListNode<Integer>(data);
				temp = head1;
			}else{
				temp.next = new ListNode<Integer>(data);
				temp = temp.next;
			}
			data = s.nextInt();
		}
		
		ListNode<Integer> head2 = null;
		temp = null;
		//enter -1 to end
		data = s.nextInt();
		while(data != -1){
			if(head2 == null){
				head2 = new ListNode<Integer>(data);
				temp = head2;
			}else{
				temp.next = new ListNode<Integer>(data);
				temp = temp.next;
			}
			data = s.nextInt();
		}
		print(AlterList(head1,head2));
	}
	
	public static void print(ListNode<Integer> head){
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
    }
    public static int length(ListNode<Integer> head){
        int ans = 0;
        ListNode<Integer> temp = head;
        while(temp!=null){
            ans ++ ;
            temp = temp.next;
        }
        return ans;
    }
    public static ListNode<Integer> AlterList(ListNode<Integer> head1,  ListNode<Integer> head2) {
        int l1 = length(head1);
        int l2 = length(head2);
        int l = (l1>l2)? l1:l2; 
        int odd[] = new int[l];
        int o =0;
        int even[] = new int[l];
        int e =0;
        while(head1 != null && head2 != null){
            int t1 = head1.data , t2 = head2.data;
            System.out.println((head1.data==head2.data) + " " + (t1 == t2));
            if(t1 == t2){
                int temp = t1;
                if(temp %2 == 0)
                    even[e++] = temp;
                else
                    odd[o++] = temp;
                System.out.println(temp);
                head2 = head2.next;
                head1 = head1.next;
            }
            else{
                if(head1.data > head2.data)
                    head2 = head2.next;
                else
                    head1 = head1.next;
                // while(head2!=null && head1.data > head2.data)
                //     head2 = head2.next;
                // while(head1!=null && head2!=null && head1.data < head2.data)
                //     head1 = head1.next;
                continue;
            }
        }
        ListNode<Integer> ans = null,temp = null;
        int o1 = 0;
        while(o-->0){
            if(ans == null){
                ans = new ListNode<Integer>(odd[o1++]);
                temp = ans ;
            }
            else{
                temp.next = new ListNode<Integer>(odd[o1++]);
                temp = temp.next;
            }
        }
        int e1 = 0;
        while(e-->0){
            if(ans == null){
                ans = new ListNode<Integer>(even[e1++]);
                temp = ans ;
            }
            else{
                temp.next = new ListNode<Integer>(even[e1++]);
                temp = temp.next;
            }
        }
        
        return ans;
    }   
}
