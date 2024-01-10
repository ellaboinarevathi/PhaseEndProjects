package com.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quid;
	private String title;
	private int quizno;
	private String subject;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Question qid;
	public int getQuizno() {
		return quizno;
	}
	public void setQuizno(int quizno) {
		this.quizno = quizno;
	}
	public int getQuid() {
		return quid;
	}
	public void setQuid(int quid) {
		this.quid = quid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Question getQid() {
		return qid;
	}
	public void setQid(Question qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "Quiz [quid=" + quid + ", title=" + title + ", quizno=" + quizno + ", subject=" + subject + ", qid="
				+ qid + "]";
	}
}
