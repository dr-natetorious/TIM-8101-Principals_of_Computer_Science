public class ryey.easer.plugins.operation.i.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.i.b> {
  public ryey.easer.plugins.operation.i.e();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #23                 // Method b:()Lryey/easer/plugins/operation/i/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.i.b);
    Code:
       0: getstatic     #27                 // Field ryey/easer/plugins/operation/i/e$1.a:[I
       3: aload_1
       4: getfield      #32                 // Field ryey/easer/plugins/operation/i/b.a:Lryey/easer/plugins/operation/i/b$a;
       7: invokevirtual #38                 // Method ryey/easer/plugins/operation/i/b$a.ordinal:()I
      10: iaload
      11: tableswitch   { // 1 to 2
                     1: 48
                     2: 40
               default: 32
          }
      32: new           #40                 // class java/lang/IllegalAccessError
      35: dup
      36: invokespecial #41                 // Method java/lang/IllegalAccessError."<init>":()V
      39: athrow
      40: aload_0
      41: getfield      #43                 // Field b:Landroid/widget/RadioButton;
      44: astore_2
      45: goto          53
      48: aload_0
      49: getfield      #45                 // Field a:Landroid/widget/RadioButton;
      52: astore_2
      53: aload_2
      54: iconst_1
      55: invokevirtual #51                 // Method android/widget/RadioButton.setChecked:(Z)V
      58: aload_0
      59: getfield      #53                 // Field c:Landroid/widget/EditText;
      62: aload_1
      63: getfield      #56                 // Field ryey/easer/plugins/operation/i/b.b:Ljava/lang/String;
      66: invokevirtual #62                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      69: aload_0
      70: getfield      #64                 // Field d:Landroid/widget/EditText;
      73: aload_1
      74: getfield      #67                 // Field ryey/easer/plugins/operation/i/b.c:I
      77: invokestatic  #73                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      80: invokevirtual #62                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      83: aload_0
      84: getfield      #75                 // Field e:Landroid/widget/EditText;
      87: aload_1
      88: getfield      #77                 // Field ryey/easer/plugins/operation/i/b.d:Ljava/lang/String;
      91: invokevirtual #62                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      94: return

  public ryey.easer.plugins.operation.i.b b();
    Code:
       0: aload_0
       1: getfield      #45                 // Field a:Landroid/widget/RadioButton;
       4: invokevirtual #83                 // Method android/widget/RadioButton.isChecked:()Z
       7: ifeq          17
      10: getstatic     #84                 // Field ryey/easer/plugins/operation/i/b$a.a:Lryey/easer/plugins/operation/i/b$a;
      13: astore_2
      14: goto          31
      17: aload_0
      18: getfield      #43                 // Field b:Landroid/widget/RadioButton;
      21: invokevirtual #83                 // Method android/widget/RadioButton.isChecked:()Z
      24: ifeq          98
      27: getstatic     #86                 // Field ryey/easer/plugins/operation/i/b$a.b:Lryey/easer/plugins/operation/i/b$a;
      30: astore_2
      31: aload_0
      32: getfield      #53                 // Field c:Landroid/widget/EditText;
      35: invokevirtual #90                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      38: invokevirtual #96                 // Method java/lang/Object.toString:()Ljava/lang/String;
      41: astore_3
      42: aload_0
      43: getfield      #64                 // Field d:Landroid/widget/EditText;
      46: invokevirtual #90                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      49: invokevirtual #96                 // Method java/lang/Object.toString:()Ljava/lang/String;
      52: invokevirtual #99                 // Method java/lang/String.trim:()Ljava/lang/String;
      55: invokestatic  #104                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
      58: invokevirtual #107                // Method java/lang/Integer.intValue:()I
      61: istore_1
      62: new           #29                 // class ryey/easer/plugins/operation/i/b
      65: dup
      66: aload_2
      67: aload_3
      68: iload_1
      69: aload_0
      70: getfield      #75                 // Field e:Landroid/widget/EditText;
      73: invokevirtual #90                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      76: invokevirtual #96                 // Method java/lang/Object.toString:()Ljava/lang/String;
      79: invokespecial #110                // Method ryey/easer/plugins/operation/i/b."<init>":(Lryey/easer/plugins/operation/i/b$a;Ljava/lang/String;ILjava/lang/String;)V
      82: areturn
      83: astore_2
      84: aload_2
      85: invokestatic  #115                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      88: new           #117                // class ryey/easer/commons/local_plugin/c
      91: dup
      92: ldc           #119                // String Invalid port
      94: invokespecial #122                // Method ryey/easer/commons/local_plugin/c."<init>":(Ljava/lang/String;)V
      97: athrow
      98: new           #124                // class java/lang/IllegalStateException
     101: dup
     102: ldc           #126                // String This line ought to be unreachable
     104: invokespecial #127                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     107: athrow
    Exception table:
       from    to  target type
          42    62    83   Class java/lang/NumberFormatException

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #29                 // class ryey/easer/plugins/operation/i/b
       5: invokevirtual #130                // Method a:(Lryey/easer/plugins/operation/i/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #133                // int 2131427450
       3: aload_2
       4: iconst_0
       5: invokevirtual #139                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #140                // int 2131296555
      13: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #47                 // class android/widget/RadioButton
      19: putfield      #45                 // Field a:Landroid/widget/RadioButton;
      22: aload_0
      23: aload_1
      24: ldc           #147                // int 2131296556
      26: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #47                 // class android/widget/RadioButton
      32: putfield      #43                 // Field b:Landroid/widget/RadioButton;
      35: aload_0
      36: aload_1
      37: ldc           #148                // int 2131296393
      39: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      42: checkcast     #58                 // class android/widget/EditText
      45: putfield      #53                 // Field c:Landroid/widget/EditText;
      48: aload_0
      49: aload_1
      50: ldc           #149                // int 2131296389
      52: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      55: checkcast     #58                 // class android/widget/EditText
      58: putfield      #64                 // Field d:Landroid/widget/EditText;
      61: aload_0
      62: aload_1
      63: ldc           #150                // int 2131296382
      65: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      68: checkcast     #58                 // class android/widget/EditText
      71: putfield      #75                 // Field e:Landroid/widget/EditText;
      74: aload_1
      75: areturn
}
