public class ryey.easer.core.ui.PermissionOutlineFragment extends android.support.v4.app.i {
  android.widget.Button a;

  public ryey.easer.core.ui.PermissionOutlineFragment();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/support/v4/app/i."<init>":()V
       4: return

  boolean a();
    Code:
       0: aload_0
       1: invokevirtual #18                 // Method getContext:()Landroid/content/Context;
       4: invokestatic  #24                 // Method ryey/easer/a.b:(Landroid/content/Context;)Z
       7: istore_2
       8: invokestatic  #29                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      11: invokevirtual #33                 // Method ryey/easer/plugins/b.e:()Lryey/easer/plugins/b$b;
      14: aload_0
      15: invokevirtual #18                 // Method getContext:()Landroid/content/Context;
      18: invokeinterface #38,  2           // InterfaceMethod ryey/easer/plugins/b$b.a:(Landroid/content/Context;)Ljava/util/List;
      23: invokeinterface #44,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      28: astore_3
      29: iconst_1
      30: istore_1
      31: aload_3
      32: invokeinterface #49,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      37: ifeq          95
      40: aload_3
      41: invokeinterface #53,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      46: checkcast     #55                 // class ryey/easer/commons/local_plugin/d
      49: astore        4
      51: aload         4
      53: aload_0
      54: invokevirtual #18                 // Method getContext:()Landroid/content/Context;
      57: invokeinterface #56,  2           // InterfaceMethod ryey/easer/commons/local_plugin/d.b:(Landroid/content/Context;)Z
      62: ifne          31
      65: ldc           #58                 // String Permission for plugin <%s> not satisfied
      67: iconst_1
      68: anewarray     #60                 // class java/lang/Object
      71: dup
      72: iconst_0
      73: aload         4
      75: invokeinterface #63,  1           // InterfaceMethod ryey/easer/commons/local_plugin/d.a:()Ljava/lang/String;
      80: aastore
      81: invokestatic  #68                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      84: iload_2
      85: ifne          90
      88: iconst_0
      89: ireturn
      90: iconst_0
      91: istore_1
      92: goto          31
      95: iload_1
      96: ireturn

  void b();
    Code:
       0: invokestatic  #29                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
       3: invokevirtual #33                 // Method ryey/easer/plugins/b.e:()Lryey/easer/plugins/b$b;
       6: aload_0
       7: invokevirtual #18                 // Method getContext:()Landroid/content/Context;
      10: invokeinterface #38,  2           // InterfaceMethod ryey/easer/plugins/b$b.a:(Landroid/content/Context;)Ljava/util/List;
      15: astore_2
      16: iconst_0
      17: istore_1
      18: iload_1
      19: aload_2
      20: invokeinterface #72,  1           // InterfaceMethod java/util/List.size:()I
      25: if_icmpge     70
      28: aload_2
      29: iload_1
      30: invokeinterface #76,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      35: checkcast     #55                 // class ryey/easer/commons/local_plugin/d
      38: astore_3
      39: aload_3
      40: aload_0
      41: invokevirtual #18                 // Method getContext:()Landroid/content/Context;
      44: invokeinterface #56,  2           // InterfaceMethod ryey/easer/commons/local_plugin/d.b:(Landroid/content/Context;)Z
      49: ifne          63
      52: aload_3
      53: aload_0
      54: invokevirtual #80                 // Method getActivity:()Landroid/support/v4/app/j;
      57: iload_1
      58: invokeinterface #83,  3           // InterfaceMethod ryey/easer/commons/local_plugin/d.a:(Landroid/app/Activity;I)V
      63: iload_1
      64: iconst_1
      65: iadd
      66: istore_1
      67: goto          18
      70: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #87                 // Method android/support/v4/app/i.onCreate:(Landroid/os/Bundle;)V
       5: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #90                 // int 2131427391
       3: aload_2
       4: iconst_0
       5: invokevirtual #96                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: areturn

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #100                // Method android/support/v4/app/i.onRequestPermissionsResult:(I[Ljava/lang/String;[I)V
       7: return

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #103                // Method android/support/v4/app/i.onResume:()V
       4: aload_0
       5: invokevirtual #105                // Method a:()Z
       8: ifeq          25
      11: aload_0
      12: invokevirtual #109                // Method getView:()Landroid/view/View;
      15: astore_2
      16: bipush        8
      18: istore_1
      19: aload_2
      20: iload_1
      21: invokevirtual #115                // Method android/view/View.setVisibility:(I)V
      24: return
      25: aload_0
      26: invokevirtual #109                // Method getView:()Landroid/view/View;
      29: astore_2
      30: iconst_0
      31: istore_1
      32: goto          19

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: ldc           #118                // int 2131296315
       4: invokevirtual #122                // Method android/view/View.findViewById:(I)Landroid/view/View;
       7: checkcast     #124                // class android/widget/Button
      10: putfield      #126                // Field a:Landroid/widget/Button;
      13: aload_0
      14: getfield      #126                // Field a:Landroid/widget/Button;
      17: new           #6                  // class ryey/easer/core/ui/PermissionOutlineFragment$1
      20: dup
      21: aload_0
      22: invokespecial #129                // Method ryey/easer/core/ui/PermissionOutlineFragment$1."<init>":(Lryey/easer/core/ui/PermissionOutlineFragment;)V
      25: invokevirtual #133                // Method android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      28: return
}
