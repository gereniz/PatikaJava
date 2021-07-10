package SigortaYonetimSistemi;

public enum  AuthenticationStatus {

	SUCCESS("Başarılı"),
	FAIL("Başarısız");
	
	private String status;
	
	
	AuthenticationStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
