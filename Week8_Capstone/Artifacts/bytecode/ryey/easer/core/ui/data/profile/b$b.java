public class ryey.easer.core.ui.data.profile.b$b extends android.widget.BaseAdapter implements se.emilsjolander.stickylistheaders.e {
  final ryey.easer.core.ui.data.profile.b a;

  ryey.easer.core.ui.data.profile.b$b(android.content.Context, java.util.List<ryey.easer.core.ui.data.profile.b$a>);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field a:Lryey/easer/core/ui/data/profile/b;
       5: aload_0
       6: invokespecial #28                 // Method android/widget/BaseAdapter."<init>":()V
       9: aload_0
      10: new           #30                 // class java/util/ArrayList
      13: dup
      14: invokespecial #31                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #33                 // Field b:Ljava/util/List;
      20: aload_0
      21: aload_2
      22: invokestatic  #39                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      25: putfield      #41                 // Field c:Landroid/view/LayoutInflater;
      28: aload_0
      29: getfield      #33                 // Field b:Ljava/util/List;
      32: aload_3
      33: invokeinterface #47,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      38: pop
      39: aload_0
      40: getfield      #33                 // Field b:Ljava/util/List;
      43: new           #11                 // class ryey/easer/core/ui/data/profile/b$b$1
      46: dup
      47: aload_0
      48: aload_1
      49: invokespecial #50                 // Method ryey/easer/core/ui/data/profile/b$b$1."<init>":(Lryey/easer/core/ui/data/profile/b$b;Lryey/easer/core/ui/data/profile/b;)V
      52: invokestatic  #56                 // Method java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
      55: return

  public long a(int);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/List;
       4: iload_1
       5: invokeinterface #64,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      10: checkcast     #66                 // class ryey/easer/core/ui/data/profile/b$a
      13: getfield      #69                 // Field ryey/easer/core/ui/data/profile/b$a.c:Lryey/easer/b/a/a;
      16: invokevirtual #75                 // Method ryey/easer/b/a/a.ordinal:()I
      19: i2l
      20: lreturn

  public android.view.View a(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     46
       4: new           #13                 // class ryey/easer/core/ui/data/profile/b$b$a
       7: dup
       8: aload_0
       9: invokespecial #79                 // Method ryey/easer/core/ui/data/profile/b$b$a."<init>":(Lryey/easer/core/ui/data/profile/b$b;)V
      12: astore_2
      13: aload_0
      14: getfield      #41                 // Field c:Landroid/view/LayoutInflater;
      17: ldc           #80                 // int 2131427405
      19: aload_3
      20: iconst_0
      21: invokevirtual #84                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      24: astore_3
      25: aload_2
      26: aload_3
      27: ldc           #85                 // int 2131296649
      29: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      32: checkcast     #93                 // class android/widget/TextView
      35: putfield      #96                 // Field ryey/easer/core/ui/data/profile/b$b$a.a:Landroid/widget/TextView;
      38: aload_3
      39: aload_2
      40: invokevirtual #100                // Method android/view/View.setTag:(Ljava/lang/Object;)V
      43: goto          60
      46: aload_2
      47: invokevirtual #104                // Method android/view/View.getTag:()Ljava/lang/Object;
      50: checkcast     #13                 // class ryey/easer/core/ui/data/profile/b$b$a
      53: astore        4
      55: aload_2
      56: astore_3
      57: aload         4
      59: astore_2
      60: aload_0
      61: getfield      #33                 // Field b:Ljava/util/List;
      64: iload_1
      65: invokeinterface #64,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      70: checkcast     #66                 // class ryey/easer/core/ui/data/profile/b$a
      73: getfield      #69                 // Field ryey/easer/core/ui/data/profile/b$a.c:Lryey/easer/b/a/a;
      76: aload_0
      77: getfield      #25                 // Field a:Lryey/easer/core/ui/data/profile/b;
      80: invokevirtual #108                // Method ryey/easer/core/ui/data/profile/b.getResources:()Landroid/content/res/Resources;
      83: invokevirtual #111                // Method ryey/easer/b/a/a.a:(Landroid/content/res/Resources;)Ljava/lang/String;
      86: astore        4
      88: aload_2
      89: getfield      #96                 // Field ryey/easer/core/ui/data/profile/b$b$a.a:Landroid/widget/TextView;
      92: aload         4
      94: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      97: aload_3
      98: areturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/List;
       4: invokeinterface #119,  1          // InterfaceMethod java/util/List.size:()I
       9: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/List;
       4: iload_1
       5: invokeinterface #64,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      10: areturn

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     54
       4: new           #16                 // class ryey/easer/core/ui/data/profile/b$b$b
       7: dup
       8: aload_0
       9: invokespecial #123                // Method ryey/easer/core/ui/data/profile/b$b$b."<init>":(Lryey/easer/core/ui/data/profile/b$b;)V
      12: astore_2
      13: aload_0
      14: getfield      #41                 // Field c:Landroid/view/LayoutInflater;
      17: ldc           #124                // int 2131427406
      19: aload_3
      20: iconst_0
      21: invokevirtual #84                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      24: astore        4
      26: aload_2
      27: aload         4
      29: ldc           #125                // int 2131296738
      31: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      34: checkcast     #93                 // class android/widget/TextView
      37: putfield      #126                // Field ryey/easer/core/ui/data/profile/b$b$b.a:Landroid/widget/TextView;
      40: aload         4
      42: aload_2
      43: invokevirtual #100                // Method android/view/View.setTag:(Ljava/lang/Object;)V
      46: aload_2
      47: astore_3
      48: aload         4
      50: astore_2
      51: goto          62
      54: aload_2
      55: invokevirtual #104                // Method android/view/View.getTag:()Ljava/lang/Object;
      58: checkcast     #16                 // class ryey/easer/core/ui/data/profile/b$b$b
      61: astore_3
      62: aload_3
      63: getfield      #126                // Field ryey/easer/core/ui/data/profile/b$b$b.a:Landroid/widget/TextView;
      66: aload_0
      67: getfield      #33                 // Field b:Ljava/util/List;
      70: iload_1
      71: invokeinterface #64,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      76: checkcast     #66                 // class ryey/easer/core/ui/data/profile/b$a
      79: getfield      #129                // Field ryey/easer/core/ui/data/profile/b$a.b:Ljava/lang/String;
      82: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      85: aload_2
      86: areturn
}
