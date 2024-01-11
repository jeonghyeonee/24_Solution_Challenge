# 24_Solution_Challenge

2024 GDSC Solution Challenge

## How to Collaborate

### 1. Fork

- Fork this repository to your own account.

### 2. Clone

- Clone the repository from your account to your local machine.
  ```sh
  git clone <forked repository address>
  ```

### 3. Add the Upstream Repository

- Add the original repository where the project was initially created as an upstream source.
  ```sh
  git remote add upstream <original repo address>
  git remote add upstream https://github.com/jeonghyeonee/24_Solution_Challenge.git
  ```

### 4. Verify Remote Repositories

- Check the list of remote repositories to ensure that your repository is set as 'origin' and the project's repository is set as 'upstream.'
  ```sh
  git remote -v
  ```

### 5. Create a Branch

- Work on your changes in a new branch on your local machine.
- Follow the branch naming convention: `ID/Name/IssueNumber`.
  ```sh
  # Example: jeonghyeonee/updateReadme/8
  ```

### 6. Add & Commit

- Add your changes using the following command:
  ```sh
  git add . or <specific file>
  ```
- Commit your changes with a meaningful commit message using either `-m` or `-s` (signed-off) option.
  - If you use `-s`, please provide a summary of your commit message.

### 7. Push

- Push your changes to your repository on the branch you created.
  ```sh
  git push origin <branchName>
  ```

### 8. Create a Pull Request

- Go to your repository on GitHub and click the "Compare & Pull Request" button.
- Assign a reviewer if necessary.

### 9. Code Review & Merge Pull Request

- The reviewer will perform a code review and decide whether to merge the pull request if there are no issues.

### 10. Synchronization and Branch Deletion After Merging

- After the merge is completed in the original repository, it's important to synchronize your local `main` branch with the code in the original repository (jeonghyeonee/Memoriary).
- To do this, go to your own GitHub repository, confirm that the active branch is `main`, and click the `Sync fork` button, then press the `Update branch` button.
- To synchronize your local `main` branch with the changes, you can execute the following commands to delete the working local branch:

```sh
  # Synchronize the code
  git checkout main
  git pull origin main

  # Forcefully delete the local branch
  git branch -D <branch>

  # Delete the remote branch
  git push origin --delete <branch>
```
