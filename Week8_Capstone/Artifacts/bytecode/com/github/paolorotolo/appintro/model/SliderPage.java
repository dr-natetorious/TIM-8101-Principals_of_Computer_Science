public class com.github.paolorotolo.appintro.model.SliderPage {
  public com.github.paolorotolo.appintro.model.SliderPage();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: return

  public int getBgColor();
    Code:
       0: aload_0
       1: getfield      #24                 // Field bgColor:I
       4: ireturn

  public int getDescColor();
    Code:
       0: aload_0
       1: getfield      #27                 // Field descColor:I
       4: ireturn

  public java.lang.String getDescTypeface();
    Code:
       0: aload_0
       1: getfield      #31                 // Field descTypeface:Ljava/lang/String;
       4: areturn

  public java.lang.CharSequence getDescription();
    Code:
       0: aload_0
       1: getfield      #35                 // Field description:Ljava/lang/CharSequence;
       4: areturn

  public java.lang.String getDescriptionString();
    Code:
       0: aload_0
       1: getfield      #35                 // Field description:Ljava/lang/CharSequence;
       4: ifnull        17
       7: aload_0
       8: getfield      #35                 // Field description:Ljava/lang/CharSequence;
      11: invokeinterface #41,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      16: areturn
      17: aconst_null
      18: areturn

  public int getImageDrawable();
    Code:
       0: aload_0
       1: getfield      #44                 // Field imageDrawable:I
       4: ireturn

  public java.lang.CharSequence getTitle();
    Code:
       0: aload_0
       1: getfield      #47                 // Field title:Ljava/lang/CharSequence;
       4: areturn

  public int getTitleColor();
    Code:
       0: aload_0
       1: getfield      #50                 // Field titleColor:I
       4: ireturn

  public java.lang.String getTitleString();
    Code:
       0: aload_0
       1: getfield      #47                 // Field title:Ljava/lang/CharSequence;
       4: ifnull        17
       7: aload_0
       8: getfield      #47                 // Field title:Ljava/lang/CharSequence;
      11: invokeinterface #41,  1           // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      16: areturn
      17: aconst_null
      18: areturn

  public java.lang.String getTitleTypeface();
    Code:
       0: aload_0
       1: getfield      #54                 // Field titleTypeface:Ljava/lang/String;
       4: areturn

  public void setBgColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #24                 // Field bgColor:I
       5: return

  public void setDescColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #27                 // Field descColor:I
       5: return

  public void setDescTypeface(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #31                 // Field descTypeface:Ljava/lang/String;
       5: return

  public void setDescription(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #35                 // Field description:Ljava/lang/CharSequence;
       5: return

  public void setImageDrawable(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #44                 // Field imageDrawable:I
       5: return

  public void setTitle(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #47                 // Field title:Ljava/lang/CharSequence;
       5: return

  public void setTitleColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #50                 // Field titleColor:I
       5: return

  public void setTitleTypeface(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #54                 // Field titleTypeface:Ljava/lang/String;
       5: return
}
