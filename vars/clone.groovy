def call(String url, String branch) {
  echo "cloning the repository"
  git url: "${url}" branch: "${branch}"
  }
