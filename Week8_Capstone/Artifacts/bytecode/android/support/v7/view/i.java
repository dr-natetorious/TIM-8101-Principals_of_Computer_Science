public class android.support.v7.view.i implements android.view.Window$Callback {
  final android.view.Window$Callback e;

  public android.support.v7.view.i(android.view.Window$Callback);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: ifnonnull     18
       8: new           #15                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #17                 // String Window callback may not be null
      14: invokespecial #20                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: putfield      #22                 // Field e:Landroid/view/Window$Callback;
      23: return

  public boolean dispatchGenericMotionEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #27,  2           // InterfaceMethod android/view/Window$Callback.dispatchGenericMotionEvent:(Landroid/view/MotionEvent;)Z
      10: ireturn

  public boolean dispatchKeyEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #31,  2           // InterfaceMethod android/view/Window$Callback.dispatchKeyEvent:(Landroid/view/KeyEvent;)Z
      10: ireturn

  public boolean dispatchKeyShortcutEvent(android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #34,  2           // InterfaceMethod android/view/Window$Callback.dispatchKeyShortcutEvent:(Landroid/view/KeyEvent;)Z
      10: ireturn

  public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #38,  2           // InterfaceMethod android/view/Window$Callback.dispatchPopulateAccessibilityEvent:(Landroid/view/accessibility/AccessibilityEvent;)Z
      10: ireturn

  public boolean dispatchTouchEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #41,  2           // InterfaceMethod android/view/Window$Callback.dispatchTouchEvent:(Landroid/view/MotionEvent;)Z
      10: ireturn

  public boolean dispatchTrackballEvent(android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #44,  2           // InterfaceMethod android/view/Window$Callback.dispatchTrackballEvent:(Landroid/view/MotionEvent;)Z
      10: ireturn

  public void onActionModeFinished(android.view.ActionMode);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #48,  2           // InterfaceMethod android/view/Window$Callback.onActionModeFinished:(Landroid/view/ActionMode;)V
      10: return

  public void onActionModeStarted(android.view.ActionMode);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #51,  2           // InterfaceMethod android/view/Window$Callback.onActionModeStarted:(Landroid/view/ActionMode;)V
      10: return

  public void onAttachedToWindow();
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: invokeinterface #54,  1           // InterfaceMethod android/view/Window$Callback.onAttachedToWindow:()V
       9: return

  public void onContentChanged();
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: invokeinterface #57,  1           // InterfaceMethod android/view/Window$Callback.onContentChanged:()V
       9: return

  public boolean onCreatePanelMenu(int, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: aload_2
       6: invokeinterface #61,  3           // InterfaceMethod android/view/Window$Callback.onCreatePanelMenu:(ILandroid/view/Menu;)Z
      11: ireturn

  public android.view.View onCreatePanelView(int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: invokeinterface #65,  2           // InterfaceMethod android/view/Window$Callback.onCreatePanelView:(I)Landroid/view/View;
      10: areturn

  public void onDetachedFromWindow();
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: invokeinterface #68,  1           // InterfaceMethod android/view/Window$Callback.onDetachedFromWindow:()V
       9: return

  public boolean onMenuItemSelected(int, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: aload_2
       6: invokeinterface #72,  3           // InterfaceMethod android/view/Window$Callback.onMenuItemSelected:(ILandroid/view/MenuItem;)Z
      11: ireturn

  public boolean onMenuOpened(int, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: aload_2
       6: invokeinterface #75,  3           // InterfaceMethod android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
      11: ireturn

  public void onPanelClosed(int, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: aload_2
       6: invokeinterface #79,  3           // InterfaceMethod android/view/Window$Callback.onPanelClosed:(ILandroid/view/Menu;)V
      11: return

  public void onPointerCaptureChanged(boolean);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: invokeinterface #83,  2           // InterfaceMethod android/view/Window$Callback.onPointerCaptureChanged:(Z)V
      10: return

  public boolean onPreparePanel(int, android.view.View, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: aload_2
       6: aload_3
       7: invokeinterface #87,  4           // InterfaceMethod android/view/Window$Callback.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
      12: ireturn

  public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup>, android.view.Menu, int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokeinterface #91,  4           // InterfaceMethod android/view/Window$Callback.onProvideKeyboardShortcuts:(Ljava/util/List;Landroid/view/Menu;I)V
      12: return

  public boolean onSearchRequested();
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: invokeinterface #97,  1           // InterfaceMethod android/view/Window$Callback.onSearchRequested:()Z
       9: ireturn

  public boolean onSearchRequested(android.view.SearchEvent);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #100,  2          // InterfaceMethod android/view/Window$Callback.onSearchRequested:(Landroid/view/SearchEvent;)Z
      10: ireturn

  public void onWindowAttributesChanged(android.view.WindowManager$LayoutParams);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #104,  2          // InterfaceMethod android/view/Window$Callback.onWindowAttributesChanged:(Landroid/view/WindowManager$LayoutParams;)V
      10: return

  public void onWindowFocusChanged(boolean);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: iload_1
       5: invokeinterface #107,  2          // InterfaceMethod android/view/Window$Callback.onWindowFocusChanged:(Z)V
      10: return

  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: invokeinterface #111,  2          // InterfaceMethod android/view/Window$Callback.onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
      10: areturn

  public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback, int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field e:Landroid/view/Window$Callback;
       4: aload_1
       5: iload_2
       6: invokeinterface #114,  3          // InterfaceMethod android/view/Window$Callback.onWindowStartingActionMode:(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
      11: areturn
}
