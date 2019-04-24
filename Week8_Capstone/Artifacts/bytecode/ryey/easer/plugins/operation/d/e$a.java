public class ryey.easer.plugins.operation.d.e$a extends android.support.v4.app.i {
  ryey.easer.plugins.operation.d.f$a a;

  android.widget.EditText b;

  android.widget.EditText c;

  android.widget.Spinner d;

  public ryey.easer.plugins.operation.d.e$a();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method android/support/v4/app/i."<init>":()V
       4: return

  static ryey.easer.plugins.operation.d.e$a a(ryey.easer.plugins.operation.d.f$a);
    Code:
       0: new           #2                  // class ryey/easer/plugins/operation/d/e$a
       3: dup
       4: invokespecial #20                 // Method "<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: putfield      #22                 // Field a:Lryey/easer/plugins/operation/d/f$a;
      13: aload_1
      14: areturn

  ryey.easer.plugins.operation.d.f$a a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/widget/EditText;
       4: invokevirtual #31                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
       7: invokevirtual #37                 // Method java/lang/Object.toString:()Ljava/lang/String;
      10: invokestatic  #42                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      13: ifeq          18
      16: aconst_null
      17: areturn
      18: new           #44                 // class ryey/easer/plugins/operation/d/f$a
      21: dup
      22: aload_0
      23: getfield      #25                 // Field b:Landroid/widget/EditText;
      26: invokevirtual #31                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      29: invokevirtual #37                 // Method java/lang/Object.toString:()Ljava/lang/String;
      32: invokevirtual #49                 // Method java/lang/String.trim:()Ljava/lang/String;
      35: aload_0
      36: getfield      #51                 // Field c:Landroid/widget/EditText;
      39: invokevirtual #31                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      42: invokevirtual #37                 // Method java/lang/Object.toString:()Ljava/lang/String;
      45: aload_0
      46: getfield      #53                 // Field d:Landroid/widget/Spinner;
      49: invokevirtual #59                 // Method android/widget/Spinner.getSelectedItem:()Ljava/lang/Object;
      52: checkcast     #46                 // class java/lang/String
      55: invokespecial #62                 // Method ryey/easer/plugins/operation/d/f$a."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      58: areturn

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: iconst_0
       1: istore        4
       3: aload_1
       4: ldc           #65                 // int 2131427445
       6: aload_2
       7: iconst_0
       8: invokevirtual #71                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      11: astore_1
      12: aload_0
      13: aload_1
      14: ldc           #72                 // int 2131296385
      16: invokevirtual #78                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      19: checkcast     #27                 // class android/widget/EditText
      22: putfield      #25                 // Field b:Landroid/widget/EditText;
      25: aload_0
      26: aload_1
      27: ldc           #79                 // int 2131296402
      29: invokevirtual #78                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      32: checkcast     #27                 // class android/widget/EditText
      35: putfield      #51                 // Field c:Landroid/widget/EditText;
      38: aload_0
      39: aload_1
      40: ldc           #80                 // int 2131296631
      42: invokevirtual #78                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      45: checkcast     #55                 // class android/widget/Spinner
      48: putfield      #53                 // Field d:Landroid/widget/Spinner;
      51: aload_0
      52: getfield      #22                 // Field a:Lryey/easer/plugins/operation/d/f$a;
      55: ifnull        138
      58: aload_0
      59: getfield      #25                 // Field b:Landroid/widget/EditText;
      62: aload_0
      63: getfield      #22                 // Field a:Lryey/easer/plugins/operation/d/f$a;
      66: getfield      #83                 // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
      69: invokevirtual #87                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      72: aload_0
      73: getfield      #51                 // Field c:Landroid/widget/EditText;
      76: aload_0
      77: getfield      #22                 // Field a:Lryey/easer/plugins/operation/d/f$a;
      80: getfield      #89                 // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
      83: invokevirtual #87                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      86: aload_0
      87: invokevirtual #93                 // Method getResources:()Landroid/content/res/Resources;
      90: ldc           #94                 // int 2130903043
      92: invokevirtual #100                // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
      95: astore_2
      96: iload         4
      98: aload_2
      99: arraylength
     100: if_icmpge     138
     103: aload_2
     104: iload         4
     106: aaload
     107: aload_0
     108: getfield      #22                 // Field a:Lryey/easer/plugins/operation/d/f$a;
     111: getfield      #102                // Field ryey/easer/plugins/operation/d/f$a.c:Ljava/lang/String;
     114: invokevirtual #106                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     117: ifeq          129
     120: aload_0
     121: getfield      #53                 // Field d:Landroid/widget/Spinner;
     124: iload         4
     126: invokevirtual #110                // Method android/widget/Spinner.setSelection:(I)V
     129: iload         4
     131: iconst_1
     132: iadd
     133: istore        4
     135: goto          96
     138: aload_1
     139: areturn
}
