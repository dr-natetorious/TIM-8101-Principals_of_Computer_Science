class ryey.easer.plugins.event.b.d$2 implements android.text.TextWatcher {
  final java.lang.String a;

  final ryey.easer.plugins.event.b.d b;

  ryey.easer.plugins.event.b.d$2(ryey.easer.plugins.event.b.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/plugins/event/b/d;
       5: aload_0
       6: invokespecial #22                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_0
      11: getfield      #19                 // Field b:Lryey/easer/plugins/event/b/d;
      14: invokevirtual #26                 // Method ryey/easer/plugins/event/b/d.getResources:()Landroid/content/res/Resources;
      17: ldc           #27                 // int 2131624041
      19: invokevirtual #33                 // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      22: putfield      #35                 // Field a:Ljava/lang/String;
      25: return

  public void afterTextChanged(android.text.Editable);
    Code:
       0: aload_1
       1: invokevirtual #42                 // Method java/lang/Object.toString:()Ljava/lang/String;
       4: ldc           #44                 // String \n
       6: invokevirtual #50                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       9: astore        5
      11: new           #52                 // class java/lang/StringBuilder
      14: dup
      15: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
      18: astore        6
      20: aload         5
      22: arraylength
      23: ifle          108
      26: aload         5
      28: arraylength
      29: istore        4
      31: iconst_0
      32: istore_2
      33: iconst_1
      34: istore_3
      35: iload_2
      36: iload         4
      38: if_icmpge     108
      41: aload         5
      43: iload_2
      44: aaload
      45: astore_1
      46: aload_1
      47: invokestatic  #58                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      50: ifeq          56
      53: goto          101
      56: iload_3
      57: ifne          68
      60: aload         6
      62: ldc           #44                 // String \n
      64: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      67: pop
      68: aload_0
      69: getfield      #19                 // Field b:Lryey/easer/plugins/event/b/d;
      72: aload_1
      73: invokestatic  #65                 // Method ryey/easer/plugins/event/b/d.b:(Lryey/easer/plugins/event/b/d;Ljava/lang/String;)Ljava/lang/String;
      76: astore_1
      77: aload_1
      78: ifnull        91
      81: aload         6
      83: aload_1
      84: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      87: pop
      88: goto          99
      91: aload_0
      92: getfield      #35                 // Field a:Ljava/lang/String;
      95: astore_1
      96: goto          81
      99: iconst_0
     100: istore_3
     101: iload_2
     102: iconst_1
     103: iadd
     104: istore_2
     105: goto          35
     108: aload_0
     109: getfield      #19                 // Field b:Lryey/easer/plugins/event/b/d;
     112: invokestatic  #68                 // Method ryey/easer/plugins/event/b/d.b:(Lryey/easer/plugins/event/b/d;)Landroid/widget/TextView;
     115: aload         6
     117: invokevirtual #69                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     120: invokevirtual #75                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     123: return

  public void beforeTextChanged(java.lang.CharSequence, int, int, int);
    Code:
       0: return

  public void onTextChanged(java.lang.CharSequence, int, int, int);
    Code:
       0: return
}
