public final class ryey.easer.core.ui.version_n_info.b extends android.support.v4.app.i {
  public static final ryey.easer.core.ui.version_n_info.b$a a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/ui/version_n_info/b$a
       3: dup
       4: aconst_null
       5: invokespecial #20                 // Method ryey/easer/core/ui/version_n_info/b$a."<init>":(La/b/b/a;)V
       8: putstatic     #22                 // Field a:Lryey/easer/core/ui/version_n_info/b$a;
      11: return

  public ryey.easer.core.ui.version_n_info.b();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: ldc           #26                 // int 2131624322
       7: putfield      #28                 // Field b:I
      10: aload_0
      11: ldc           #29                 // int 2131624317
      13: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      16: putfield      #37                 // Field c:Ljava/lang/Integer;
      19: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #39                 // Field d:Ljava/util/HashMap;
       4: ifnull        14
       7: aload_0
       8: getfield      #39                 // Field d:Ljava/util/HashMap;
      11: invokevirtual #44                 // Method java/util/HashMap.clear:()V
      14: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #48                 // String inflater
       3: invokestatic  #53                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokevirtual #57                 // Method getArguments:()Landroid/os/Bundle;
      10: astore_3
      11: aconst_null
      12: astore        4
      14: aload_3
      15: ifnull        57
      18: aload_3
      19: ldc           #59                 // String STRING_TITLE_ID
      21: invokevirtual #65                 // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
      24: iconst_1
      25: if_icmpne     57
      28: aload_0
      29: invokevirtual #57                 // Method getArguments:()Landroid/os/Bundle;
      32: astore_3
      33: aload_3
      34: ifnull        50
      37: aload_3
      38: ldc           #59                 // String STRING_TITLE_ID
      40: invokevirtual #69                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      43: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      46: astore_3
      47: goto          52
      50: aconst_null
      51: astore_3
      52: aload_0
      53: aload_3
      54: putfield      #37                 // Field c:Ljava/lang/Integer;
      57: aload_0
      58: invokevirtual #57                 // Method getArguments:()Landroid/os/Bundle;
      61: astore        5
      63: aload         4
      65: astore_3
      66: aload         5
      68: ifnull        82
      71: aload         5
      73: ldc           #71                 // String STRING_CONTENT_ID
      75: invokevirtual #69                 // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      78: invokestatic  #35                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      81: astore_3
      82: aload_3
      83: ifnonnull     89
      86: invokestatic  #73                 // Method a/b/b/c.a:()V
      89: aload_0
      90: aload_3
      91: invokevirtual #77                 // Method java/lang/Integer.intValue:()I
      94: putfield      #28                 // Field b:I
      97: aload_1
      98: ldc           #78                 // int 2131427399
     100: aload_2
     101: iconst_0
     102: invokevirtual #84                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
     105: astore_1
     106: aload_1
     107: ldc           #85                 // int 2131296721
     109: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
     112: checkcast     #93                 // class android/widget/TextView
     115: astore_2
     116: aload_0
     117: getfield      #37                 // Field c:Ljava/lang/Integer;
     120: astore_3
     121: aload_3
     122: ifnull        136
     125: aload_2
     126: aload_3
     127: checkcast     #95                 // class java/lang/Number
     130: invokevirtual #96                 // Method java/lang/Number.intValue:()I
     133: invokevirtual #100                // Method android/widget/TextView.setText:(I)V
     136: aload_1
     137: ldc           #101                // int 2131296363
     139: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
     142: checkcast     #93                 // class android/widget/TextView
     145: astore_2
     146: aload_2
     147: aload_0
     148: getfield      #28                 // Field b:I
     151: invokevirtual #100                // Method android/widget/TextView.setText:(I)V
     154: aload_2
     155: ldc           #103                // String tvDescription
     157: invokestatic  #105                // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     160: aload_2
     161: invokestatic  #111                // Method android/text/method/LinkMovementMethod.getInstance:()Landroid/text/method/MovementMethod;
     164: invokevirtual #115                // Method android/widget/TextView.setMovementMethod:(Landroid/text/method/MovementMethod;)V
     167: aload_1
     168: areturn

  public void onDestroyView();
    Code:
       0: aload_0
       1: invokespecial #118                // Method android/support/v4/app/i.onDestroyView:()V
       4: aload_0
       5: invokevirtual #119                // Method a:()V
       8: return
}
