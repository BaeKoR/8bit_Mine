package mul.cam.a.dto;

import java.io.Serializable;

public class GbDto implements Serializable {

	private int seq;
	private String toid;
	private String fromid;
	private String comment;
	private int ref;
	private int step;
	private int isvoice;
	private String filename;
	private String regdate;
	
	public GbDto() {
	}

	public GbDto(int seq, String toid, String fromid, String comment, int ref, int step, int isvoice, String filename,
			String regdate) {
		super();
		this.seq = seq;
		this.toid = toid;
		this.fromid = fromid;
		this.comment = comment;
		this.ref = ref;
		this.step = step;
		this.isvoice = isvoice;
		this.filename = filename;
		this.regdate = regdate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getToid() {
		return toid;
	}

	public void setToid(String toid) {
		this.toid = toid;
	}

	public String getFromid() {
		return fromid;
	}

	public void setFromid(String fromid) {
		this.fromid = fromid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getIsvoice() {
		return isvoice;
	}

	public void setIsvoice(int isvoice) {
		this.isvoice = isvoice;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	
}