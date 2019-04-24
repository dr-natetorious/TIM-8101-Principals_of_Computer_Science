public class ryey.easer.core.ui.data.profile.b extends android.support.v4.app.h {
  ryey.easer.core.ui.data.profile.b$c j;

  java.util.Map<java.lang.Class<? extends ryey.easer.commons.local_plugin.c.d>, java.lang.Integer> k;

  java.util.List<ryey.easer.core.ui.data.profile.b$a> l;

  ryey.easer.core.f m;

  public ryey.easer.core.ui.data.profile.b();
    Code:
       0: aload_0
       1: invokespecial #37                 // Method android/support/v4/app/h."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #39                 // Field j:Lryey/easer/core/ui/data/profile/b$c;
       9: aload_0
      10: new           #41                 // class android/support/v4/g/a
      13: dup
      14: invokespecial #42                 // Method android/support/v4/g/a."<init>":()V
      17: putfield      #44                 // Field k:Ljava/util/Map;
      20: return

  void a(ryey.easer.commons.local_plugin.c.d);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_1
       3: invokevirtual #52                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       6: astore_3
       7: aload_0
       8: getfield      #44                 // Field k:Ljava/util/Map;
      11: aload_3
      12: invokeinterface #58,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      17: ifeq          59
      20: aload_0
      21: getfield      #44                 // Field k:Ljava/util/Map;
      24: astore_1
      25: aload_0
      26: getfield      #44                 // Field k:Ljava/util/Map;
      29: aload_3
      30: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      35: checkcast     #64                 // class java/lang/Integer
      38: invokevirtual #68                 // Method java/lang/Integer.intValue:()I
      41: iconst_1
      42: iadd
      43: invokestatic  #72                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      46: astore_2
      47: aload_1
      48: aload_3
      49: aload_2
      50: invokeinterface #76,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      55: pop
      56: goto          72
      59: aload_0
      60: getfield      #44                 // Field k:Ljava/util/Map;
      63: astore_1
      64: iconst_1
      65: invokestatic  #72                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      68: astore_2
      69: goto          47
      72: aload_0
      73: monitorexit
      74: return
      75: astore_1
      76: aload_0
      77: monitorexit
      78: aload_1
      79: athrow
    Exception table:
       from    to  target type
           2    47    75   any
          47    56    75   any
          59    69    75   any

  void a(ryey.easer.core.ui.data.profile.b$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #39                 // Field j:Lryey/easer/core/ui/data/profile/b$c;
       5: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #81                 // Method android/support/v4/app/h.onAttach:(Landroid/content/Context;)V
       5: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #85                 // Method android/support/v4/app/h.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: new           #87                 // class ryey/easer/core/f
       9: dup
      10: aload_0
      11: invokevirtual #91                 // Method getContext:()Landroid/content/Context;
      14: invokespecial #93                 // Method ryey/easer/core/f."<init>":(Landroid/content/Context;)V
      17: putfield      #95                 // Field m:Lryey/easer/core/f;
      20: aload_0
      21: getfield      #95                 // Field m:Lryey/easer/core/f;
      24: invokevirtual #97                 // Method ryey/easer/core/f.a:()V
      27: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #100                // int 2131427384
       3: aload_2
       4: iconst_0
       5: invokevirtual #106                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_1
      10: ldc           #107                // int 16908298
      12: invokevirtual #113                // Method android/view/View.findViewById:(I)Landroid/view/View;
      15: checkcast     #115                // class se/emilsjolander/stickylistheaders/StickyListHeadersListView
      18: astore_2
      19: invokestatic  #120                // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      22: invokevirtual #123                // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
      25: aload_0
      26: invokevirtual #91                 // Method getContext:()Landroid/content/Context;
      29: invokevirtual #128                // Method ryey/easer/plugins/b$c.a:(Landroid/content/Context;)Ljava/util/List;
      32: astore_3
      33: aload_0
      34: new           #130                // class java/util/ArrayList
      37: dup
      38: aload_3
      39: invokeinterface #135,  1          // InterfaceMethod java/util/List.size:()I
      44: invokespecial #138                // Method java/util/ArrayList."<init>":(I)V
      47: putfield      #140                // Field l:Ljava/util/List;
      50: aload_3
      51: invokeinterface #144,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      56: astore_3
      57: aload_3
      58: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      63: ifeq          187
      66: aload_3
      67: invokeinterface #154,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      72: checkcast     #156                // class ryey/easer/commons/local_plugin/c/d
      75: astore        4
      77: aload_0
      78: getfield      #44                 // Field k:Ljava/util/Map;
      81: aload         4
      83: invokevirtual #52                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      86: invokeinterface #58,  2           // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
      91: ifeq          137
      94: aload         4
      96: invokeinterface #159,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.f:()I
     101: ifle          137
     104: aload_0
     105: getfield      #44                 // Field k:Ljava/util/Map;
     108: aload         4
     110: invokevirtual #52                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
     113: invokeinterface #62,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     118: checkcast     #64                 // class java/lang/Integer
     121: invokevirtual #68                 // Method java/lang/Integer.intValue:()I
     124: aload         4
     126: invokeinterface #159,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.f:()I
     131: if_icmplt     137
     134: goto          57
     137: aload_0
     138: getfield      #140                // Field l:Ljava/util/List;
     141: new           #10                 // class ryey/easer/core/ui/data/profile/b$a
     144: dup
     145: aload         4
     147: invokeinterface #162,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.a:()Ljava/lang/String;
     152: aload         4
     154: invokeinterface #166,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.d:()Lryey/easer/commons/local_plugin/e;
     159: aload_0
     160: invokevirtual #170                // Method getResources:()Landroid/content/res/Resources;
     163: invokevirtual #175                // Method ryey/easer/commons/local_plugin/e.a:(Landroid/content/res/Resources;)Ljava/lang/String;
     166: aload         4
     168: invokeinterface #179,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.g:()Lryey/easer/b/a/a;
     173: aload         4
     175: invokespecial #182                // Method ryey/easer/core/ui/data/profile/b$a."<init>":(Ljava/lang/String;Ljava/lang/String;Lryey/easer/b/a/a;Lryey/easer/commons/local_plugin/c/d;)V
     178: invokeinterface #185,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     183: pop
     184: goto          57
     187: aload_2
     188: new           #13                 // class ryey/easer/core/ui/data/profile/b$b
     191: dup
     192: aload_0
     193: aload_0
     194: invokevirtual #91                 // Method getContext:()Landroid/content/Context;
     197: aload_0
     198: getfield      #140                // Field l:Ljava/util/List;
     201: invokespecial #188                // Method ryey/easer/core/ui/data/profile/b$b."<init>":(Lryey/easer/core/ui/data/profile/b;Landroid/content/Context;Ljava/util/List;)V
     204: invokevirtual #192                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.setAdapter:(Lse/emilsjolander/stickylistheaders/e;)V
     207: aload_2
     208: new           #6                  // class ryey/easer/core/ui/data/profile/b$1
     211: dup
     212: aload_0
     213: invokespecial #195                // Method ryey/easer/core/ui/data/profile/b$1."<init>":(Lryey/easer/core/ui/data/profile/b;)V
     216: invokevirtual #199                // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
     219: aload_1
     220: areturn

  public void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #202                // Method android/support/v4/app/h.onDestroy:()V
       4: aload_0
       5: getfield      #95                 // Field m:Lryey/easer/core/f;
       8: invokevirtual #204                // Method ryey/easer/core/f.b:()V
      11: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #95                 // Field m:Lryey/easer/core/f;
       4: new           #8                  // class ryey/easer/core/ui/data/profile/b$2
       7: dup
       8: aload_0
       9: aload_1
      10: invokespecial #209                // Method ryey/easer/core/ui/data/profile/b$2."<init>":(Lryey/easer/core/ui/data/profile/b;Landroid/view/View;)V
      13: invokevirtual #212                // Method ryey/easer/core/f.a:(Lryey/easer/core/f$f;)V
      16: return
}
