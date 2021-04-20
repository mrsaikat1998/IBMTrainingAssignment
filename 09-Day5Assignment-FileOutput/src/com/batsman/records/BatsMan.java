package com.batsman.records;

import java.io.Serializable;

public class BatsMan implements Serializable {
	private int bId;
	private String bName;
	private int innings;
	private int matches;
	private long totalRuns;

	public BatsMan(int bId, String bName, int innings, int matches, long totalRuns) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.innings = innings;
		this.matches = matches;
		this.totalRuns = totalRuns;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public long getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(long totalRuns) {
		this.totalRuns = totalRuns;
	}

	@Override
	public String toString() {
		return "BatsMan [bId=" + bId + ", bName=" + bName + ", innings=" + innings + ", matches=" + matches
				+ ", totalRuns=" + totalRuns + "]";
	}

}
