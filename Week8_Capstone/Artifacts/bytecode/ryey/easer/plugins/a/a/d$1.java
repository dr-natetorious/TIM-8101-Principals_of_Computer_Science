class ryey.easer.plugins.a.a.d$1 implements android.view.View$OnClickListener {
  final ryey.easer.plugins.a.a.d a;

  ryey.easer.plugins.a.a.d$1(ryey.easer.plugins.a.a.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/plugins/a/a/d;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #17                 // Field a:Lryey/easer/plugins/a/a/d;
       7: getfield      #27                 // Field ryey/easer/plugins/a/a/d.c:[Landroid/widget/RadioButton;
      10: arraylength
      11: if_icmpge     47
      14: aload_1
      15: aload_0
      16: getfield      #17                 // Field a:Lryey/easer/plugins/a/a/d;
      19: getfield      #27                 // Field ryey/easer/plugins/a/a/d.c:[Landroid/widget/RadioButton;
      22: iload_2
      23: aaload
      24: if_acmpne     40
      27: aload_0
      28: getfield      #17                 // Field a:Lryey/easer/plugins/a/a/d;
      31: iload_2
      32: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      35: invokestatic  #36                 // Method ryey/easer/plugins/a/a/d.a:(Lryey/easer/plugins/a/a/d;Ljava/lang/Integer;)Ljava/lang/Integer;
      38: pop
      39: return
      40: iload_2
      41: iconst_1
      42: iadd
      43: istore_2
      44: goto          2
      47: return
}
