package solutions;

import java.util.ArrayList;
import java.util.List;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){this.val=x;}
}

public class AddTwoNumbers {	
	public static void main(String[] args){

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		int num1=listToInt(l1);
		int num2=listToInt(l2);
		
		int sum=num1+num2;
		
		ListNode result=intToList(sum);
		return result;
	}
	
	private int listToInt(ListNode list){
		int degree=0;
		int size=0;
		int result=0;
		ListNode temp=list;
		
		if(list!=null){
			size=1;
			//Get size of list
			while(list.next!=null){
				size++;
				list=list.next;
			}
		}
		
		//Convert list elements to an integer
		for(int i=0;i<size;i++){
			int value=temp.val;
			result+=(value) * (Math.pow((double)10, (double)degree));
			degree++;
			temp=temp.next;
		}
		
		return result;
	}
	
	private ListNode intToList(int num){
		List<Integer> list=new ArrayList<>();
		int quotient, remainder;
		do{
			quotient=num / 10;
			remainder=num % 10;
			
			list.add(remainder);
			
			num=num/10;
		}while(quotient>0);
		
		ListNode ptr,result;
		ptr=result=null;
		
		for(int i=0;i<list.size();i++){
			if(result==null){
				ListNode temp=new ListNode(list.get(i));
				ptr=temp;
				result=temp;
			}
			else{
				ListNode temp=new ListNode(list.get(i));
				ptr.next=temp;
				ptr=ptr.next;
			}
		}
		
		return result;
	}
}
