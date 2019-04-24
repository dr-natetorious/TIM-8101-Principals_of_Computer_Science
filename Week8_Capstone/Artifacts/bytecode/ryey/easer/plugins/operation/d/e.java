public class ryey.easer.plugins.operation.d.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.d.b> {
  public ryey.easer.plugins.operation.d.e();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: new           #23                 // class java/util/ArrayList
       8: dup
       9: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #26                 // Field e:Ljava/util/List;
      15: return

  static java.util.List a(ryey.easer.plugins.operation.d.e);
    Code:
       0: aload_0
       1: getfield      #26                 // Field e:Ljava/util/List;
       4: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #32                 // Method b:()Lryey/easer/plugins/operation/d/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.d.b);
    Code:
       0: aload_1
       1: getfield      #38                 // Field ryey/easer/plugins/operation/d/b.a:Lryey/easer/plugins/operation/d/f;
       4: astore_1
       5: aload_0
       6: getfield      #40                 // Field a:Landroid/widget/EditText;
       9: aload_1
      10: getfield      #45                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      13: invokevirtual #51                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      16: aload_0
      17: getfield      #53                 // Field b:Landroid/widget/EditText;
      20: astore        4
      22: aload_1
      23: getfield      #55                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      26: astore        5
      28: iconst_0
      29: istore_3
      30: aload         4
      32: aload         5
      34: iconst_0
      35: invokestatic  #60                 // Method ryey/easer/b.a:(Ljava/util/Collection;Z)Ljava/lang/String;
      38: invokevirtual #51                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      41: aload_0
      42: getfield      #62                 // Field c:Landroid/widget/EditText;
      45: aload_1
      46: getfield      #64                 // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
      49: invokevirtual #51                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      52: aload_1
      53: getfield      #67                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      56: ifnull        73
      59: aload_0
      60: getfield      #69                 // Field d:Landroid/widget/EditText;
      63: aload_1
      64: getfield      #67                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      67: invokevirtual #75                 // Method android/net/Uri.toString:()Ljava/lang/String;
      70: invokevirtual #51                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      73: aload_1
      74: getfield      #76                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
      77: ifnull        220
      80: aload_0
      81: invokevirtual #80                 // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      84: invokevirtual #85                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      87: astore        4
      89: iload_3
      90: istore_2
      91: aload_0
      92: getfield      #26                 // Field e:Ljava/util/List;
      95: invokeinterface #91,  1           // InterfaceMethod java/util/List.size:()I
     100: ifle          154
     103: aload_0
     104: getfield      #26                 // Field e:Ljava/util/List;
     107: invokeinterface #95,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     112: astore        5
     114: aload         5
     116: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     121: ifeq          143
     124: aload         4
     126: aload         5
     128: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     133: checkcast     #9                  // class ryey/easer/plugins/operation/d/e$a
     136: invokevirtual #110                // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
     139: pop
     140: goto          114
     143: aload_0
     144: getfield      #26                 // Field e:Ljava/util/List;
     147: invokeinterface #113,  1          // InterfaceMethod java/util/List.clear:()V
     152: iload_3
     153: istore_2
     154: iload_2
     155: aload_1
     156: getfield      #76                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     159: invokeinterface #91,  1           // InterfaceMethod java/util/List.size:()I
     164: if_icmpge     214
     167: aload_1
     168: getfield      #76                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     171: iload_2
     172: invokeinterface #117,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     177: checkcast     #119                // class ryey/easer/plugins/operation/d/f$a
     180: invokestatic  #122                // Method ryey/easer/plugins/operation/d/e$a.a:(Lryey/easer/plugins/operation/d/f$a;)Lryey/easer/plugins/operation/d/e$a;
     183: astore        5
     185: aload         4
     187: ldc           #123                // int 2131296459
     189: aload         5
     191: invokevirtual #126                // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
     194: pop
     195: aload_0
     196: getfield      #26                 // Field e:Ljava/util/List;
     199: aload         5
     201: invokeinterface #130,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     206: pop
     207: iload_2
     208: iconst_1
     209: iadd
     210: istore_2
     211: goto          154
     214: aload         4
     216: invokevirtual #132                // Method android/support/v4/app/u.c:()I
     219: pop
     220: return

  public ryey.easer.plugins.operation.d.b b();
    Code:
       0: new           #42                 // class ryey/easer/plugins/operation/d/f
       3: dup
       4: invokespecial #133                // Method ryey/easer/plugins/operation/d/f."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #40                 // Field a:Landroid/widget/EditText;
      13: invokevirtual #137                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      16: invokevirtual #140                // Method java/lang/Object.toString:()Ljava/lang/String;
      19: putfield      #45                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      22: aload_1
      23: aload_0
      24: getfield      #53                 // Field b:Landroid/widget/EditText;
      27: invokevirtual #137                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      30: invokevirtual #140                // Method java/lang/Object.toString:()Ljava/lang/String;
      33: invokestatic  #143                // Method ryey/easer/b.b:(Ljava/lang/String;)Ljava/util/List;
      36: putfield      #55                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      39: aload_1
      40: aload_0
      41: getfield      #62                 // Field c:Landroid/widget/EditText;
      44: invokevirtual #137                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      47: invokevirtual #140                // Method java/lang/Object.toString:()Ljava/lang/String;
      50: putfield      #64                 // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
      53: aload_1
      54: aload_0
      55: getfield      #69                 // Field d:Landroid/widget/EditText;
      58: invokevirtual #137                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      61: invokevirtual #140                // Method java/lang/Object.toString:()Ljava/lang/String;
      64: invokestatic  #147                // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
      67: putfield      #67                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      70: aload_0
      71: getfield      #26                 // Field e:Ljava/util/List;
      74: invokeinterface #91,  1           // InterfaceMethod java/util/List.size:()I
      79: ifle          145
      82: new           #23                 // class java/util/ArrayList
      85: dup
      86: aload_0
      87: getfield      #26                 // Field e:Ljava/util/List;
      90: invokeinterface #91,  1           // InterfaceMethod java/util/List.size:()I
      95: invokespecial #150                // Method java/util/ArrayList."<init>":(I)V
      98: astore_2
      99: aload_0
     100: getfield      #26                 // Field e:Ljava/util/List;
     103: invokeinterface #95,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     108: astore_3
     109: aload_3
     110: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     115: ifeq          140
     118: aload_2
     119: aload_3
     120: invokeinterface #105,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     125: checkcast     #9                  // class ryey/easer/plugins/operation/d/e$a
     128: invokevirtual #153                // Method ryey/easer/plugins/operation/d/e$a.a:()Lryey/easer/plugins/operation/d/f$a;
     131: invokeinterface #130,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     136: pop
     137: goto          109
     140: aload_1
     141: aload_2
     142: putfield      #76                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     145: new           #35                 // class ryey/easer/plugins/operation/d/b
     148: dup
     149: aload_1
     150: invokespecial #156                // Method ryey/easer/plugins/operation/d/b."<init>":(Lryey/easer/plugins/operation/d/f;)V
     153: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #35                 // class ryey/easer/plugins/operation/d/b
       5: invokevirtual #159                // Method a:(Lryey/easer/plugins/operation/d/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #162                // int 2131427444
       3: aload_2
       4: iconst_0
       5: invokevirtual #168                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #169                // int 2131296710
      13: invokevirtual #175                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #47                 // class android/widget/EditText
      19: putfield      #40                 // Field a:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #176                // int 2131296712
      26: invokevirtual #175                // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #47                 // class android/widget/EditText
      32: putfield      #53                 // Field b:Landroid/widget/EditText;
      35: aload_0
      36: aload_1
      37: ldc           #177                // int 2131296716
      39: invokevirtual #175                // Method android/view/View.findViewById:(I)Landroid/view/View;
      42: checkcast     #47                 // class android/widget/EditText
      45: putfield      #62                 // Field c:Landroid/widget/EditText;
      48: aload_0
      49: aload_1
      50: ldc           #178                // int 2131296713
      52: invokevirtual #175                // Method android/view/View.findViewById:(I)Landroid/view/View;
      55: checkcast     #47                 // class android/widget/EditText
      58: putfield      #69                 // Field d:Landroid/widget/EditText;
      61: aload_1
      62: ldc           #179                // int 2131296312
      64: invokevirtual #175                // Method android/view/View.findViewById:(I)Landroid/view/View;
      67: new           #7                  // class ryey/easer/plugins/operation/d/e$1
      70: dup
      71: aload_0
      72: invokespecial #182                // Method ryey/easer/plugins/operation/d/e$1."<init>":(Lryey/easer/plugins/operation/d/e;)V
      75: invokevirtual #186                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      78: aload_1
      79: areturn
}
