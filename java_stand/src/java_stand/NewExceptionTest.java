package java_stand;

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println("���� �޽���:"+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �� �� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}catch(MemoryException me) {
			System.out.println("���� �޽���:"+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���");
		}finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException,MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ �� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}

}
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
