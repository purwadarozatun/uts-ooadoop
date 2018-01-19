class Soal {
  String soal;
  String jawabanA;
  String jawabanB;
  String jawabanC;
  String jawabanD;
  String jawabanE;

  String jawabanBenar;

  Soal (String soal , String jawabanA ,  String jawabanB , String jawabanC,  String jawabanD, String jawabanE, String jawabanBenar){
    this.soal = soal;
    this.jawabanA = jawabanA;
    this.jawabanB = jawabanB;
    this.jawabanC = jawabanC;
    this.jawabanD = jawabanD;
    this.jawabanE = jawabanE;
    this.jawabanBenar = jawabanBenar;
  }

  public Boolean isJawabanBenar( String jawabanMhs) {
    return (this.jawabanBenar.equals(jawabanMhs));
  }

  public String getJawabanA(){
    return this.jawabanA;
  }
  public void setJawabanA(String jawabanA){
    this.jawabanA = jawabanA;
  }
}