package boardtest.selectExam;

import java.sql.Blob;
import java.util.Date;

public class Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
	
	
	public Board() {}


	public Board(int bno, String btitle, String bcontent, String bwriter, Date bdate, String bfilename,
			Blob bfiledata) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bfilename = bfilename;
		this.bfiledata = bfiledata;
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getBtitle() {
		return btitle;
	}


	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public String getBwriter() {
		return bwriter;
	}


	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	public String getBfilename() {
		return bfilename;
	}


	public void setBfilename(String bfilename) {
		this.bfilename = bfilename;
	}


	public Blob getBfiledata() {
		return bfiledata;
	}


	public void setBfiledata(Blob bfiledata) {
		this.bfiledata = bfiledata;
	}


	@Override
	public String toString() {
		return "Board [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bdate=" + bdate + ", bfilename=" + bfilename + ", bfiledata=" + bfiledata + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bno;
		result = prime * result + ((bwriter == null) ? 0 : bwriter.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bno != other.bno)
			return false;
		if (bwriter == null) {
			if (other.bwriter != null)
				return false;
		} else if (!bwriter.equals(other.bwriter))
			return false;
		return true;
	}
	
	

	

}
