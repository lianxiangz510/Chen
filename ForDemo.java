//����ѭ��֮forѭ��
public class ForDemo 
{
	public static void main(String[] args) 
	{
		//��������һ����˧��
		
		for (int i = 1;i <= 100 ;i++ )
		{
			//System.out.println("˧��"+i);
		}
		
		//��������һ����һ��
		for (int i = 1;i <= 100 ;i++ )//i���壬������Ĳ��ظ���
		{
			//System.out.println(i);
		}
		//���������ʥ�������1+����������������������100�ĺ�
		int sum = 0;
		for (int i = 1;i <= 100 ;i++ )//i���壬������Ĳ��ظ���
		{
			sum += i;

		}
			System.out.println("1+++....=100Ϊ��"+sum);
			//System.out.println(i);  �Ҳ���i����ֻ�ڻ�������������

		/*
			for (System.out.println("Hello World!"); ;System.out.println("Hello World!") )
			{
				System.out.println("Hello World!");
			}
		*/

		//forѭ��ת��whlieѭ��
	}
}
