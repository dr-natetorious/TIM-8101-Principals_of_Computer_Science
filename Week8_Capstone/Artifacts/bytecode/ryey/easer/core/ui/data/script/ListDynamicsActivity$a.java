class ryey.easer.core.ui.data.script.ListDynamicsActivity$a extends android.widget.ArrayAdapter<ryey.easer.core.ui.data.script.ListDynamicsActivity$b> {
  ryey.easer.core.ui.data.script.ListDynamicsActivity$a(android.content.Context, java.util.List<ryey.easer.core.ui.data.script.ListDynamicsActivity$b>);
    Code:
       0: aload_0
       1: aload_1
       2: ldc           #13                 // int 2131427404
       4: aload_2
       5: invokespecial #16                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;ILjava/util/List;)V
       8: return

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     75
       4: aload_0
       5: invokevirtual #25                 // Method getContext:()Landroid/content/Context;
       8: invokestatic  #31                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      11: ldc           #13                 // int 2131427404
      13: aload_3
      14: iconst_0
      15: invokevirtual #35                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      18: astore_2
      19: new           #10                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a
      22: dup
      23: aconst_null
      24: invokespecial #38                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a."<init>":(Lryey/easer/core/ui/data/script/ListDynamicsActivity$1;)V
      27: astore_3
      28: aload_3
      29: aload_2
      30: ldc           #39                 // int 2131296739
      32: invokevirtual #45                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      35: checkcast     #47                 // class android/widget/TextView
      38: putfield      #50                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.a:Landroid/widget/TextView;
      41: aload_3
      42: aload_2
      43: ldc           #51                 // int 2131296735
      45: invokevirtual #45                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      48: checkcast     #47                 // class android/widget/TextView
      51: putfield      #54                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.b:Landroid/widget/TextView;
      54: aload_3
      55: aload_2
      56: ldc           #55                 // int 2131296734
      58: invokevirtual #45                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      61: checkcast     #47                 // class android/widget/TextView
      64: putfield      #58                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.c:Landroid/widget/TextView;
      67: aload_2
      68: aload_3
      69: invokevirtual #62                 // Method android/view/View.setTag:(Ljava/lang/Object;)V
      72: goto          83
      75: aload_2
      76: invokevirtual #66                 // Method android/view/View.getTag:()Ljava/lang/Object;
      79: checkcast     #10                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a
      82: astore_3
      83: aload_0
      84: iload_1
      85: invokevirtual #70                 // Method getItem:(I)Ljava/lang/Object;
      88: checkcast     #72                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
      91: astore        4
      93: aload         4
      95: ifnonnull     100
      98: aload_2
      99: areturn
     100: aload_3
     101: getfield      #50                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.a:Landroid/widget/TextView;
     104: aload         4
     106: getfield      #75                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.a:Ljava/lang/String;
     109: invokevirtual #79                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     112: aload         4
     114: getfield      #81                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.c:Ljava/lang/String;
     117: ifnull        154
     120: aload_3
     121: getfield      #54                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.b:Landroid/widget/TextView;
     124: aload         4
     126: getfield      #81                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.c:Ljava/lang/String;
     129: invokevirtual #79                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     132: aload_3
     133: getfield      #58                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.c:Landroid/widget/TextView;
     136: aload         4
     138: getfield      #83                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.b:Ljava/lang/String;
     141: invokevirtual #79                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     144: aload_3
     145: getfield      #58                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.c:Landroid/widget/TextView;
     148: iconst_0
     149: invokevirtual #87                 // Method android/widget/TextView.setVisibility:(I)V
     152: aload_2
     153: areturn
     154: aload_3
     155: getfield      #54                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.b:Landroid/widget/TextView;
     158: aload         4
     160: getfield      #83                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.b:Ljava/lang/String;
     163: invokevirtual #79                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     166: aload_3
     167: getfield      #58                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$a$a.c:Landroid/widget/TextView;
     170: bipush        8
     172: invokevirtual #87                 // Method android/widget/TextView.setVisibility:(I)V
     175: aload_2
     176: areturn
}
