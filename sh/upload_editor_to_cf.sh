#!/bin/bash

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "${SCRIPT_DIR}/.." && pwd)"

rm -rf "${PROJECT_ROOT}/resources/public/js/compiled"

current_timestamp=$(date +%s)000

INDEX_PATH="${PROJECT_ROOT}/resources/public/index.html"
ASSET_PATH="${PROJECT_ROOT}/resources/public"

echo "Replacing __COMMIT_SHA__ with current timestamp"
sed -i '' "s/__COMMIT_SHA__/${current_timestamp}/g" ${INDEX_PATH}

echo "Building editor"
npm run release

echo "Uploading editor to Cloudflare"
npx wrangler pages deploy ${ASSET_PATH} --project-name immersa-editor

echo "Reverting current timestamp to __COMMIT_SHA__"
sed -i '' "s/${current_timestamp}/__COMMIT_SHA__/g" ${INDEX_PATH}
