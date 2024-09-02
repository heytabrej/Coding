#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *left, *right;
};

struct node *createTree(int data) {
  struct node *newNode = (struct node *)malloc(sizeof(struct node));
  newNode->data = data;
  newNode->left = newNode->right = NULL;

  char choice;
  printf("Has left child (y/n)? ");
  scanf("%c", &choice);
  if (choice == 'y') {
    newNode->left = createTree(0); // Ask for data later
  }

  printf("Has right child (y/n)? ");
  scanf("%c", &choice);
  if (choice == 'y') {
    newNode->right = createTree(0); // Ask for data later
  }

  printf("Enter data for %d: ", data);
  scanf("%d", &newNode->data); // Update data after child creation

  return newNode;
}

void inorderPrint(struct node *root) {
  if (root == NULL) {
    return;
  }
  inorderPrint(root->left);
  printf("%d ", root->data);
  inorderPrint(root->right);
}

void preorderPrint(struct node *root) {
  if (root == NULL) {
    return;
  }
  printf("%d ", root->data);
  preorderPrint(root->left);
  preorderPrint(root->right);
}

void postorderPrint(struct node *root) {
  if (root == NULL) {
    return;
  }
  postorderPrint(root->left);
  postorderPrint(root->right);
  printf("%d ", root->data);
}

void freeTree(struct node *root) {
  if (root == NULL) {
    return;
  }
  freeTree(root->left);
  freeTree(root->right);
  free(root);
}

int main() {
    
  struct node *root = createTree(22);
  printf("\nInorder Traversal: ");
  inorderPrint(root);

  printf("\nPreorder Traversal: ");
  preorderPrint(root);

  printf("\nPostorder Traversal: ");
  postorderPrint(root);

  freeTree(root); // Free allocated memory

  return 0;
}
