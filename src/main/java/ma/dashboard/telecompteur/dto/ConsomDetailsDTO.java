package ma.dashboard.telecompteur.dto;

import java.sql.Date;


public class ConsomDetailsDTO {
	
	Long  userId;
	String   nom;
	String  prenom;
	String  genre;
	String  cin;
	String  num_abonnement;
	Long  idcompteur;
	String  marque;
	String  code;
	Date  dateMiseEnOeuvre;
	Boolean  isActive;
	Double   indexEauNew;
	Double   indexElectNew;
	Date  dateDernierMAJ;
	Integer  mois;
	Integer  annee;
	
	
	
	public ConsomDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsomDetailsDTO(Long userId, String nom, String prenom, String genre, String cin, String num_abonnement,
			Long idcompteur, String marque, String code, Date dateMiseEnOeuvre, Boolean isActive,
			Double indexEauNew, Double indexElectNew, Date dateDernierMAJ, Integer mois, Integer annee) {
		super();
		this.userId = userId;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.cin = cin;
		this.num_abonnement = num_abonnement;
		this.idcompteur = idcompteur;
		this.marque = marque;
		this.code = code;
		this.dateMiseEnOeuvre = dateMiseEnOeuvre;
		this.isActive = isActive;
		this.indexEauNew = indexEauNew;
		this.indexElectNew = indexElectNew;
		this.dateDernierMAJ = dateDernierMAJ;
		this.mois = mois;
		this.annee = annee;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNum_abonnement() {
		return num_abonnement;
	}
	public void setNum_abonnement(String num_abonnement) {
		this.num_abonnement = num_abonnement;
	}
	public Long getIdcompteur() {
		return idcompteur;
	}
	public void setIdcompteur(Long idcompteur) {
		this.idcompteur = idcompteur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateMiseEnOeuvre() {
		return dateMiseEnOeuvre;
	}
	public void setDateMiseEnOeuvre(Date dateMiseEnOeuvre) {
		this.dateMiseEnOeuvre = dateMiseEnOeuvre;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Double getIndexEauNew() {
		return indexEauNew;
	}
	public void setIndexEauNew(Double indexEauNew) {
		this.indexEauNew = indexEauNew;
	}
	public Double getIndexElectNew() {
		return indexElectNew;
	}
	public void setIndexElectNew(Double indexElectNew) {
		this.indexElectNew = indexElectNew;
	}
	public Date getDateDernierMAJ() {
		return dateDernierMAJ;
	}
	public void setDateDernierMAJ(Date dateDernierMAJ) {
		this.dateDernierMAJ = dateDernierMAJ;
	}
	public Integer getMois() {
		return mois;
	}
	public void setMois(Integer mois) {
		this.mois = mois;
	}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	@Override
	public String toString() {
		return "ConsomDetailsDTO [userId=" + userId + ", nom=" + nom + ", prenom=" + prenom + ", genre=" + genre
				+ ", cin=" + cin + ", num_abonnement=" + num_abonnement + ", idcompteur=" + idcompteur + ", marque="
				+ marque + ", code=" + code + ", dateMiseEnOeuvre=" + dateMiseEnOeuvre + ", isActive=" + isActive
				+ ", indexEauNew=" + indexEauNew + ", indexElectNew=" + indexElectNew + ", dateDernierMAJ="
				+ dateDernierMAJ + ", mois=" + mois + ", annee=" + annee + "]";
	}
	

	

}
